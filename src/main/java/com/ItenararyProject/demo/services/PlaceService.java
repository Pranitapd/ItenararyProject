package com.ItenararyProject.demo.services;

import com.ItenararyProject.demo.domain.Place;

import java.util.Set;

public interface PlaceService {
    public Place getPlaceById(Long Id);
    public Set<Place> getAllPlaces();
    public Place saveOrUpdate(Place place);
}
