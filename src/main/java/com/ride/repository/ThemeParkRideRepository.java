package com.ride.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ride.entity.ThemeParkRide;

import java.util.List;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
}
