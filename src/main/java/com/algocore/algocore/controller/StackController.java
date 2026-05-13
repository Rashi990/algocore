package com.algocore.algocore.controller;

import com.algocore.algocore.service.StackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/stack")
@CrossOrigin
public class StackController {

    private final StackService stackService;

    public StackController(StackService stackService) {
        this.stackService = stackService;
    }

    @PostMapping("/initialize/{capacity}")
    public ResponseEntity<String> initialize(@PathVariable int capacity){
        stackService.initialize(capacity);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Stack initialized with capacity : " + capacity);
    }

    @PostMapping("push/{data}")
    public ResponseEntity<String> push(@PathVariable int data){
        stackService.push(data);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Pushed : " + data);
    }

    @DeleteMapping("/pop")
    public ResponseEntity<Integer> pop(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(stackService.pop());
    }

    @GetMapping("/peek")
    public ResponseEntity<Integer> peek(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(stackService.peek());
    }

    @GetMapping("/size")
    public ResponseEntity<Integer> size(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(stackService.size());
    }

    @GetMapping("/isempty")
    public ResponseEntity<Boolean> isEmpty(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(stackService.isEmpty());
    }

    @GetMapping("print")
    public ResponseEntity<int[]> printStack(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(stackService.printStack());
    }
}
