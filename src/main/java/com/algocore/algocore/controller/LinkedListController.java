package com.algocore.algocore.controller;

import com.algocore.algocore.service.LinkedListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/linkedlist")
@CrossOrigin
public class LinkedListController {

    private final LinkedListService linkedListService;

    public LinkedListController(LinkedListService linkedListService) {
        this.linkedListService = linkedListService;
    }

    @PostMapping("/insert-end/{data}")
    public ResponseEntity<String> insertEnd(@PathVariable int data){
        linkedListService.insertAtEnd(data);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Inserted at end : " + data);
    }

    @PostMapping("/insert-begin/{data}")
    public ResponseEntity<String> insertBegin(@PathVariable int data){
        linkedListService.insertAtBeginning(data);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Inserted at beginning : " + data);
    }

    @DeleteMapping("/delete/{data}")
    public ResponseEntity<String> delete(@PathVariable int data){
        linkedListService.delete(data);
        return ResponseEntity.ok("Deleted : " + data);
    }

    @GetMapping("/search/{data}")
    public ResponseEntity<Boolean> search(@PathVariable int data){
        return ResponseEntity.ok(linkedListService.search(data));
    }

    @GetMapping("/size")
    public ResponseEntity<Integer> size(){
        return ResponseEntity.ok(linkedListService.size());
    }

    @GetMapping("/isempty")
    public ResponseEntity<Boolean> isempty(){
        return ResponseEntity.ok(linkedListService.isEmpty());
    }

    @GetMapping("/print")
    public ResponseEntity<int[]> print(){
        return ResponseEntity.ok(linkedListService.printList());
    }

}
