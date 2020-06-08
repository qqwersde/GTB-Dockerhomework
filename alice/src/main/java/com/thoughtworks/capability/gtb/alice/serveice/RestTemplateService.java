package com.thoughtworks.capability.gtb.alice.serveice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {
    @Autowired
    RestTemplate restTemplate;

    public String someRestCall() {
        return restTemplate.getForObject("http://bobapp/hello", String.class);
    }
}
