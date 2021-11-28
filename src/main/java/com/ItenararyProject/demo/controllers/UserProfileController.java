package com.ItenararyProject.demo.controllers;

import com.ItenararyProject.demo.domain.Interests;
import com.ItenararyProject.demo.domain.UserProfile;
import com.ItenararyProject.demo.services.InterestService;
import com.ItenararyProject.demo.services.UserProfileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Controller
public class UserProfileController {
    private final UserProfileService userProfileService;
    private final InterestService interestService;

    public UserProfileController(UserProfileService userProfileService, InterestService interestService) {
        this.userProfileService = userProfileService;
        this.interestService = interestService;
    }

    @GetMapping
    @RequestMapping("/users")
    public String listAllUserProfiles(Model model)
    {
        model.addAttribute("users",userProfileService.findAllUsers());
        return "userProfile/show";
    }

    @RequestMapping(value = "/users/{id}/show", method = RequestMethod.GET)
    public String getUserById(@PathVariable Long id, Model model)
    {
        UserProfile u1 = userProfileService.getUserById(id);
        System.out.println(u1.getName());
        Set<Interests> ints = u1.getInterests();
        model.addAttribute("User", u1 );
        return "userProfile/showUser";
    }

    @RequestMapping(value = "/users/new")
    public String newUserProfile(Model model)
    {
        model.addAttribute("userProfile", new UserProfile());
        model.addAttribute("SetInterest",interestService.getAllInterests());
        return "userProfile/userForm";
    }

    @RequestMapping(value = "users", method = RequestMethod.POST)
    public String saveOrUpdateUserProfile(@ModelAttribute UserProfile userProfile)
    {
        System.out.println(userProfile.getPassword());
        UserProfile userProfile1 = userProfileService.saveOrUpdateUser(userProfile);
        return "redirect:/users/" +userProfile1.getId() + "/show";
    }
}
