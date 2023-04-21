package com.example.testmd4_c11.repository;

import com.example.testmd4_c11.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City,Long> {
}
