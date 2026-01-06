package com.productivity.productivity_backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {

    @GetMapping
    public ResponseEntity<List<String>> getTasks() {
        List<String> tasks = List.of(
        "Learn Spring Security",
        "Build React UI",
        "Integrate JWT"
    );
    return ResponseEntity.ok(tasks);
    }
}
