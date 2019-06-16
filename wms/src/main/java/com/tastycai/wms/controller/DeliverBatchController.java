package com.tastycai.wms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliverBatchController {

    @RequestMapping("/register/{id}")
    public String register(@PathVariable("id") Integer deliverBatchId){

        System.out.println(deliverBatchId + "挂单");

        return null;
    }
}
