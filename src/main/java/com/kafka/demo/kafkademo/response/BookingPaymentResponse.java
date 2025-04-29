package com.kafka.demo.kafkademo.response;

import com.kafka.demo.kafkademo.entity.Booking;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class BookingPaymentResponse extends PaymentResponse{

    private Booking booking;

    private Long paymentAmount;
}
