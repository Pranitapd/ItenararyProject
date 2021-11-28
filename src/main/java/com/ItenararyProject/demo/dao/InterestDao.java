package com.ItenararyProject.demo.dao;

import com.ItenararyProject.demo.domain.Interests;

import java.util.Set;

public interface InterestDao {
    public Interests getInterestById(Long id);
    public Set<Interests> getAllInterests();
    public Interests saveOrUpdate(Interests interests);
}
