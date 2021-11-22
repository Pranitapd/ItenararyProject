package com.ItenararyProject.demo.repository;

import com.ItenararyProject.demo.domain.Attractions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionsRepository extends JpaRepository<Attractions, Long> {
}
