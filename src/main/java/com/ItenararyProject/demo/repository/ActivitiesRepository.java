package com.ItenararyProject.demo.repository;

import com.ItenararyProject.demo.domain.Activities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, Long> {
}
