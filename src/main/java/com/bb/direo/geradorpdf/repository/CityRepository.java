/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bb.direo.geradorpdf.repository;

import com.bb.direo.geradorpdf.bean.City;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Haylton
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long>{
    List<City> findByName(String name);
    List<City> findByPopulation(int population);
    Optional<City> findById(int id);
}
