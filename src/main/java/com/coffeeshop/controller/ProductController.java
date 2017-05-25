package com.coffeeshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Crawlers on 5/24/2017.
 */
@Controller
public class ProductController {
    @GetMapping("/product-list")
    public String productList(){
        return "product-list";
    }

    @GetMapping("/product-add")
    public String productAdd(){
        return "product-add";
    }
}
