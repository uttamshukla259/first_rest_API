package com.example.uttam;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<String,Student> db = new HashMap<>();

    //get imformation..
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("p") String name){
        return db.get(name);
    }
    //adding imformation..
    @PostMapping("/added_student")
    public String addStudent(@RequestBody Student student){
        String name = student.getName();
        db.put(name,student);
        return "Student added successfully";
    }
}
