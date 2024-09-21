package com.example.springbooot.repository;

import com.example.springbooot.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository  extends JpaRepository<Car, Long> {

}
