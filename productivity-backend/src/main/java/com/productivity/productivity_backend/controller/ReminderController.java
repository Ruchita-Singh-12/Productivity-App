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
@RequestMapping("/api/reminders")
@CrossOrigin(origins = "http://localhost:3000")
public class ReminderController {

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> getReminders() {

        List<Map<String, Object>> reminders = new ArrayList<>();

        Map<String, Object> r1 = new HashMap<>();
        r1.put("id", 1);
        r1.put("title", "Drink Water");
        r1.put("time", "10:00");

        Map<String, Object> r2 = new HashMap<>();
        r2.put("id", 2);
        r2.put("title", "Stand & Stretch");
        r2.put("time", "12:00");

        Map<String, Object> r3 = new HashMap<>();
        r3.put("id", 3);
        r3.put("title", "Read Book");
        r3.put("time", "20:00");

        reminders.add(r1);
        reminders.add(r2);
        reminders.add(r3);

        return ResponseEntity.ok(reminders); // ✅ PURE LIST
    }
}
