package com.fays.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class myRestController {

        @GetMapping(value = "/okx")
        public String getTestData() {



            return "Mon premier web service";
        }
    }

