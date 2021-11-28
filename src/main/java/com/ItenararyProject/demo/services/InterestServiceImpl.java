package com.ItenararyProject.demo.services;

import com.ItenararyProject.demo.dao.InterestDao;
import com.ItenararyProject.demo.domain.Interests;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class InterestServiceImpl implements InterestService {
    private final InterestDao interestDao;

    public InterestServiceImpl(InterestDao interestDao) {
        this.interestDao = interestDao;
    }

    @Override
    public Interests getInterestById(Long id) {
        return interestDao.getInterestById(id);
    }

    @Override
    public Set<Interests> getAllInterests() {
        return interestDao.getAllInterests();
    }

    @Override
    public Interests saveOrUpdate(Interests interests) {
        return interestDao.saveOrUpdate(interests);
    }
}
