package com.example.projecttwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/two")
    public String first (){
        return "two";
    }

}
