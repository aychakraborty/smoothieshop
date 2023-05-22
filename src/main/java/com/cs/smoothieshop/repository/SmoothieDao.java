package com.cs.smoothieshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.smoothieshop.entity.Smoothie;

/**
 * This is Smoothie JPA Repository class
 * 
 * @author Ayan, Chakraborty
 */
@Repository
public interface SmoothieDao extends CrudRepository<Smoothie, Long> {

}
