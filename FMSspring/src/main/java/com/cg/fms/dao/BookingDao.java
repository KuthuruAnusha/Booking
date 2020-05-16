package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.entity.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking,Integer>{

}
