package com.kafka.demo.kafkademo.request;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class BookingRequest {

    private Long bookableEventId;

    private Integer noOfCustomers;

    private Integer customerId;
}
