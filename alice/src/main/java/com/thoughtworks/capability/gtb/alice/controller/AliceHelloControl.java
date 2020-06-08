package com.thoughtworks.capability.gtb.alice.controller;

import com.thoughtworks.capability.gtb.alice.serveice.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class AliceHelloControl {
    @Autowired
    private RestTemplateService restTemplateService;

    @RequestMapping
    public Object index() {
        return restTemplateService.someRestCall();
    }

}
