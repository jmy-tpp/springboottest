package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    String getTest() {
        return "Hello 1.19!";
    }
}
