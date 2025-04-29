package com.kafka.demo.kafkademo.repository;

import com.kafka.demo.kafkademo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Long, Customer> {



}
