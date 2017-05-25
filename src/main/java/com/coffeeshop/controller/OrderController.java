package com.coffeeshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Crawlers on 5/24/2017.
 */
@Controller
public class OrderController {
    @GetMapping("/order-list")
    public String orderList(){
        return "order-list";
    }
}
