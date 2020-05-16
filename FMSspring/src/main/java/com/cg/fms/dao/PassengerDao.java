package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cg.fms.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger,Integer>{

}
