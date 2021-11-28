package com.ItenararyProject.demo.services;

import com.ItenararyProject.demo.domain.Interests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface InterestService {
    public Interests getInterestById(Long id);
    public Set<Interests> getAllInterests();
    public Interests saveOrUpdate(Interests interests);
}
