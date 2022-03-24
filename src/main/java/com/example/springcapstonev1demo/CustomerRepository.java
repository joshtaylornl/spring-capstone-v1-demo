package com.example.springcapstonev1demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Customer repository
 *
 * @author Josh
 */
public interface CustomerRepository extends CrudRepository <Customer, Integer> {

    //If we need specialized queries beyond those included in CrudRepository we can engage here or in the Repository interface

}
