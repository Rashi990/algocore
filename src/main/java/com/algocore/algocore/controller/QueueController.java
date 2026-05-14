package com.algocore.algocore.controller;

import com.algocore.algocore.service.QueueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/queue")
@CrossOrigin
public class QueueController {

    private final QueueService queueService;

    public QueueController(QueueService queueService) {
        this.queueService = queueService;
    }

    @PostMapping("/initialize/{capacity}")
    public ResponseEntity<String> initialize(@PathVariable int capacity){
        queueService.initialize(capacity);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Queue initialized with capacity " + capacity);
    }

    @PostMapping("/enqueue/{data}")
    public ResponseEntity<String> enqueue(@PathVariable int data){
        queueService.enqueue(data);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Enqueued : " + data);
    }

    @DeleteMapping("/dequeue")
    public ResponseEntity<Integer> dequeue(){
        return ResponseEntity.ok(queueService.dequeue());
    }

    @GetMapping("/front")
    public ResponseEntity<Integer> front(){
        return ResponseEntity.ok(queueService.front());
    }

    @GetMapping("/size")
    public ResponseEntity<Integer> size(){
        return ResponseEntity.ok(queueService.size());
    }

    @GetMapping("/isempty")
    public ResponseEntity<Boolean> isEmpty(){
        return ResponseEntity.ok(queueService.isEmpty());
    }

    @GetMapping("/print")
    public ResponseEntity<int[]> print(){
        return ResponseEntity.ok(queueService.printQueue());
    }
}
