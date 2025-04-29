package com.kafka.demo.kafkademo.service;

import com.kafka.demo.kafkademo.request.PaymentRequest;
import com.kafka.demo.kafkademo.response.PaymentResponse;

public interface PaymentService {

    public PaymentResponse process(PaymentRequest request);
}
