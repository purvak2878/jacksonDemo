package org.example.scuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome Everyone";
    }

    @GetMapping("/employee")
    public String employee() {
        return "Employee Page";
    }

    @GetMapping("/manager")
    public String manager() {
        return "Manager Page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Page";
    }
}
