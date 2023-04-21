package com.example.testmd4_c11.repository;

import com.example.testmd4_c11.model.Nation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INationRepository extends JpaRepository<Nation,Long> {
}
