package com.kafka.demo.kafkademo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class BookingPaymentRequest extends PaymentRequest{

    private Long bookingId;

    private Long customerId;

    private Long amount;

}
