/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bb.direo.geradorpdf.service;

import com.bb.direo.geradorpdf.bean.City;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Haylton
 */
public interface ICityService {
    public List<City> findAll();
    
    public List<City> findByName(String name);
    
    public List<City> findByPopulation(int population);
    
    Optional<City> findById(Long id);
}


