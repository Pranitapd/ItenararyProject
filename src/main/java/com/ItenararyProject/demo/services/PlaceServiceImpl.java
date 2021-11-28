package com.ItenararyProject.demo.services;

import com.ItenararyProject.demo.dao.PlaceDao;
import com.ItenararyProject.demo.domain.Place;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlaceServiceImpl implements PlaceService {
    private final PlaceDao placeDao;

    public PlaceServiceImpl(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

    @Override
    public Place getPlaceById(Long Id) {
        return placeDao.getPlaceById(Id);
    }

    @Override
    public Set<Place> getAllPlaces() {
        return placeDao.getAllPlaces();
    }

    @Override
    public Place saveOrUpdate(Place place) {
        return placeDao.saveOrUpdate(place);
    }
}
