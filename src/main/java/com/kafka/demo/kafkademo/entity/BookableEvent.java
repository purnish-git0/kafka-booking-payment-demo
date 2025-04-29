package com.kafka.demo.kafkademo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class BookableEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "bookableEvent")
    private List<Booking> bookings;
}
