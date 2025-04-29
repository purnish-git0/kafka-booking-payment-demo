package com.kafka.demo.kafkademo.request;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class BookingRequest {

    private Long bookableEventId;

    private Integer noOfCustomers;

    private Integer customerId;
}
