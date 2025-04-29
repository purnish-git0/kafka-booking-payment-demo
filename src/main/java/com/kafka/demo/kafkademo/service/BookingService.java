package com.kafka.demo.kafkademo.service;

import com.kafka.demo.kafkademo.request.PaymentRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class BookingService {


    private Logger LOG = Logger.getLogger("BookingLogger");

    @KafkaListener(topics = "booking-events", groupId = "booking-group", containerFactory = "bookingConsumerFactory")
    public void listenBookingEvents(String message) {

        LOG.info("Received Message in group booking-group: " + message);

    }

    private PaymentRequest createBookingPaymentRequest() {
        return null;
    }
}
