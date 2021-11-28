package com.ItenararyProject.demo.controllers;

import com.ItenararyProject.demo.dao.PlaceDao;
import com.ItenararyProject.demo.domain.Place;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashSet;
import java.util.Set;

@Controller
public class PlaceController {
    private final PlaceDao placeDao;

    public PlaceController(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

    @RequestMapping("/places")
    public String getPlaces(Model model)
    {
        Set<Place> places = new HashSet<>();
        placeDao.getAllPlaces().iterator().forEachRemaining(places::add);
        model.addAttribute("Places",places);
        return "places/show";
    }

    @RequestMapping(value = "/places", method = RequestMethod.POST)
    public String saveOrUpdate(@ModelAttribute Place place)
    {
        Place newPlace = placeDao.saveOrUpdate(place);
        return "redirect:/places/" + newPlace.getId() + "/show";
    }

    @RequestMapping(value = "/places/{id}/show")
    public String getPlaceById(@PathVariable Long id, Model model)
    {
        Place place = placeDao.getPlaceById(id);
        model.addAttribute("Place", place);
        return "places/showPlace";
    }
}
