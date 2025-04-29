package com.kafka.demo.kafkademo.service;

import com.kafka.demo.kafkademo.entity.Booking;
import com.kafka.demo.kafkademo.request.PaymentRequest;
import com.kafka.demo.kafkademo.response.PaymentResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class CustomPaymentService implements PaymentService{

    private final KafkaTemplate<String, Booking> bookingKafkaTemplate;

    @Override
    public PaymentResponse process(PaymentRequest request) {

        return null;
    }
}
