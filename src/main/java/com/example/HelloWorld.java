package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zgl on 16-12-12.
 */
@SpringBootApplication
@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

}
