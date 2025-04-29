package com.kafka.demo.kafkademo.service;


import com.kafka.demo.kafkademo.request.PaymentRequest;
import com.kafka.demo.kafkademo.response.PaymentResponse;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PaymentServiceImpl implements PaymentService {


    private Logger LOG = Logger.getAnonymousLogger();


    @KafkaListener(
            topics = "booking-events",
            containerFactory = "filterKafkaListenerContainerFactory")
    public void listenWithFilter(String message) {
        LOG.info("Received Message in filtered listener: " + message);

    }

    @Override
    public PaymentResponse process(PaymentRequest request) {

        return null;
    }
}
