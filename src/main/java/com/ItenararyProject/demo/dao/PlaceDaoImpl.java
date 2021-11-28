package com.ItenararyProject.demo.dao;

import com.ItenararyProject.demo.domain.Place;
import com.ItenararyProject.demo.repository.AttractionsRepository;
import com.ItenararyProject.demo.repository.PlaceRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class PlaceDaoImpl implements PlaceDao {

    public final PlaceRepository placeRepository;
    public final AttractionsRepository attractionsRepository;

    public PlaceDaoImpl(PlaceRepository placeRepository, AttractionsRepository attractionsRepository) {
        this.placeRepository = placeRepository;
        this.attractionsRepository = attractionsRepository;
    }

    @Override
    public Place getPlaceById(Long Id) {
        return placeRepository.getById(Id);
    }

    @Override
    public Set<Place> getAllPlaces() {
        Set<Place> places = new HashSet<>();
        placeRepository.findAll().iterator().forEachRemaining(places::add);
        return places;
    }

    @Override
    public Place saveOrUpdate(Place place) {
        return placeRepository.save(place);
    }
}
