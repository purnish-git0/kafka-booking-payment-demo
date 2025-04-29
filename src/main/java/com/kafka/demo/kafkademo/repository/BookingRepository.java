package com.kafka.demo.kafkademo.repository;

import com.kafka.demo.kafkademo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {



}
