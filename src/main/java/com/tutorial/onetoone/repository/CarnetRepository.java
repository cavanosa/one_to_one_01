package com.tutorial.onetoone.repository;

import com.tutorial.onetoone.entity.Carnet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarnetRepository extends JpaRepository<Carnet, Integer> {
}
