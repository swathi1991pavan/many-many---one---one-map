package com.cglia.mmoomappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.mmoomappings.model.Address;


@Repository
public interface AddressRepository  extends JpaRepository<Address, Integer>{

}
