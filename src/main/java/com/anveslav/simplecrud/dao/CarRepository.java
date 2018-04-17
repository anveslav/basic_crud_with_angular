package com.anveslav.simplecrud.dao;

import com.anveslav.simplecrud.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
