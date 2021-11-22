package com.ItenararyProject.demo.controllers;

import com.ItenararyProject.demo.domain.UserProfile;
import com.ItenararyProject.demo.services.UserProfileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class UserProfileController {
    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
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
        model.addAttribute("user", userProfileService.getUserById(id));
        return "userProfile/showUser";
    }

    @RequestMapping(value = "/users/new")
    public String newUserProfile(Model model)
    {
        model.addAttribute("userProfile", new UserProfile());
        return "userProfile/userForm";
    }

    @RequestMapping(value = "users", method = RequestMethod.POST)
    public String saveOrUpdateUserProfile(@ModelAttribute UserProfile userProfile)
    {
        UserProfile userProfile1 = userProfileService.saveOrUpdateUser(userProfile);

        return "redirect:/users/" +userProfile1.getId() + "/show";
    }
}
