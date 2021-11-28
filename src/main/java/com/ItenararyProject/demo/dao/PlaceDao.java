package com.ItenararyProject.demo.dao;

import com.ItenararyProject.demo.domain.Place;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public interface PlaceDao {
    public Place getPlaceById(Long Id);
    public Set<Place> getAllPlaces();
    public Place saveOrUpdate(Place place);
}
