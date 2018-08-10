/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bb.direo.geradorpdf.service;

import com.bb.direo.geradorpdf.bean.City;
import com.bb.direo.geradorpdf.repository.CityRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Haylton
 */
@Service
public class CityService implements ICityService{
    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {
       List<City> cities = (List<City>) repository.findAll();
       return cities;
    }

    @Override
    public List<City> findByName(String name) {
        List<City> cities = repository.findByName(name);
        return cities;
    }

    @Override
    public List<City> findByPopulation(int population) {
         List<City> cities = repository.findByPopulation(population);
         return cities;
    }

    @Override
    public Optional<City> findById(Long id) {
        Optional<City> city = repository.findById(id);
        return city;
    }
    
    
}
