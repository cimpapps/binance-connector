package com.acvl.crypto.binanceconnector.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BinanceClient {

    private RestTemplate restTemplate;

    @Autowired
    public BinanceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

}
