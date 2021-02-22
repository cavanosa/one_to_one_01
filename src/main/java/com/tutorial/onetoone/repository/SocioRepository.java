package com.tutorial.onetoone.repository;

import com.tutorial.onetoone.entity.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer> {
}
