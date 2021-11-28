package com.ItenararyProject.demo.dao;

import com.ItenararyProject.demo.domain.Interests;
import com.ItenararyProject.demo.repository.InterestRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InterestDaoImpl implements InterestDao {
    private final InterestRepository interestRepository;

    public InterestDaoImpl(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    @Override
    public Interests getInterestById(Long id) {
        return interestRepository.getById(id);
    }

    @Override
    public Set<Interests> getAllInterests() {
        Set<Interests> interests= new HashSet<>();
        interestRepository.findAll().iterator().forEachRemaining(interests::add);
        return interests;
    }

    @Override
    public Interests saveOrUpdate(Interests interests) {
        return interestRepository.save(interests);
    }
}
