package com.example.coursereg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.coursereg.model.Course;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CourseController {

    List<Course> courseList = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("courses", courseList);
        return "index";
    }

    @PostMapping("/add")
    public String addCourse(@RequestParam String name) {
        courseList.add(new Course(name));
        return "redirect:/";
    }
}
