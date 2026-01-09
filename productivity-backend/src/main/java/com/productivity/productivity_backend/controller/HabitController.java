package com.productivity.productivity_backend.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/habits")
@CrossOrigin(origins = "http://localhost:3000")
public class HabitController {

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> getHabits() {

        List<Map<String, Object>> habits = new ArrayList<>();

        Map<String, Object> h1 = new HashMap<>();
        h1.put("id", 1);
        h1.put("name", "Morning Walk");
        h1.put("status", "Completed");

        Map<String, Object> h2 = new HashMap<>();
        h2.put("id", 2);
        h2.put("name", "Meditation");
        h2.put("status", "Pending");

        Map<String, Object> h3 = new HashMap<>();
        h3.put("id", 3);
        h3.put("name", "Reading");
        h3.put("status", "Completed");

        habits.add(h1);
        habits.add(h2);
        habits.add(h3);

        return ResponseEntity.ok(habits); // ✅ PURE LIST
    }
}

