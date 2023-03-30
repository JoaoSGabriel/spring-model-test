package com.exercise.modelagem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.modelagem.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
