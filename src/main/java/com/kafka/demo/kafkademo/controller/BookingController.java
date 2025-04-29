package com.kafka.demo.kafkademo.controller;

import com.kafka.demo.kafkademo.entity.Booking;
import com.kafka.demo.kafkademo.repository.BookingRepository;
import com.kafka.demo.kafkademo.request.BookingRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/booking")
@AllArgsConstructor
@Slf4j
public class BookingController {

    private final BookingRepository repository;

    private final KafkaTemplate<String, Booking> bookingKafkaTemplate;

    private Logger LOG = Logger.getAnonymousLogger();

    @PostMapping("/create-booking")
    public ResponseEntity<String> createBooking(@RequestBody BookingRequest request) {
        Booking booking = Booking.builder()
                .bookableEventId(request.getBookableEventId())
                .noOfCustomers(request.getNoOfCustomers())
                .customerId(request.getCustomerId())
                .build();

        repository.save(booking);

        CompletableFuture<SendResult<String, Booking>> bookingFuture
                = bookingKafkaTemplate.send("booking-events", booking);

        bookingFuture.whenComplete((result, ex) -> {
            if(ex == null) {
                LOG.info("Result with:" + result.getRecordMetadata().toString());
            }
            else {
                LOG.log(Level.SEVERE, "Exception thrown. Message not sent");
            }
        });
        return ResponseEntity.ok("done");

    }


}
