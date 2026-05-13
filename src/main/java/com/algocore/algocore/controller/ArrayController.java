package com.algocore.algocore.controller;

import com.algocore.algocore.service.ArrayService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/v1/array")
@CrossOrigin
public class ArrayController {

    //Constructor injection
    private final ArrayService arrayService;

    public ArrayController(ArrayService arrayService) {
        this.arrayService = arrayService;
    }

    @PostMapping("/initialize/{capacity}")
    public ResponseEntity<String> initialize(@PathVariable int capacity){
        arrayService.initialize(capacity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Array initialized with capacity " + capacity);
    }

    @PostMapping("/insert/{data}")
    public ResponseEntity<String> insert(@PathVariable int data){
        arrayService.insert(data);
        return ResponseEntity.status(HttpStatus.CREATED).body("Inserted : " + data);
    }

    @GetMapping("/search/{data}")
    public ResponseEntity<Integer> search(@PathVariable int data){
        int index = arrayService.search(data);
        return ResponseEntity.status(HttpStatus.OK)
                .body(index);
    }

    @GetMapping("/get/{index}")
    public ResponseEntity<Integer> get(@PathVariable int index){
        int data = arrayService.get(index);
        return ResponseEntity.status(HttpStatus.OK)
                .body(data);
    }

    @GetMapping("/size")
    public ResponseEntity<Integer> size(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(arrayService.size());
    }

    @DeleteMapping("/delete/{index}")
    public ResponseEntity<String> delete(@PathVariable int index){
        arrayService.delete(index);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Deleted element at index : " + index);
    }

    @GetMapping("/print")
    public ResponseEntity<int[]> printArr(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(arrayService.printArr());
    }
}
