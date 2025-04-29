package com.kafka.demo.kafkademo.service;

import com.kafka.demo.kafkademo.entity.Booking;
import com.kafka.demo.kafkademo.request.BookingPaymentRequest;
import com.kafka.demo.kafkademo.request.PaymentRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class BookingService {


    private Logger LOG = Logger.getLogger("BookingLogger");

    private final KafkaTemplate<String, PaymentRequest> paymentRequestKafkaTemplate;


    @KafkaListener(topics = "booking-events", groupId = "booking-group", containerFactory = "bookingConsumerFactory")
    public void listenBookingEvents(Booking booking) {

        LOG.info("Received Booking in group booking-group: " + booking.getId());
        PaymentRequest paymentRequest = createBookingPaymentRequest(booking);

        paymentRequestKafkaTemplate.send("payment-request", paymentRequest);


    }

    private PaymentRequest createBookingPaymentRequest(Booking booking) {

        return BookingPaymentRequest
                .builder()
                .bookingId(booking.getId())
                .customerId(booking.getCustomer().getId())
                .amount(100l)
                .build();

    }
}
