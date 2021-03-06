package com.onetomany.unidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetomany.unidirectional.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long>{

}

