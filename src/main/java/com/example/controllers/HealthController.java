package com.example.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daniil Arkhipov on 18/05/2017.
 */
@Controller
@EnableAutoConfiguration
public class HealthController {

    @RequestMapping("/healthcheck")
    @ResponseBody
    public String healthCheck() {
        return "OK!";
    }

}