package com.itr.JacksonDemo.PojoToJson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(@RequestParam int id) {

        if (id != 101) {
            throw new StudentNotFoundException("Student not found with ID : " + id);
        }

        return new Student(
                101,
                "Purva Kulkarni",
                "Diploma in Information Technology"
        );
    }
}
