package com.coffeeshop.controller;

import com.coffeeshop.model.Address;
import com.coffeeshop.model.Product;
import com.coffeeshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Crawlers on 5/24/2017.
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product-list")
    public String productList(Model model){
        List<Product> products = productService.getAll();
        System.out.println("list:"+products);
        model.addAttribute("products", products);
        return "product-list";
    }

    @GetMapping("/product-add")
    public String productAdd(@RequestParam(value="id", required = false) Integer id, Model model){
        if (id!=null){
            model.addAttribute("product", productService.getById(id));
        }
        return "product-add";
    }

    @PostMapping({"/product-add"})
    public String add(Product product, Model model){
        System.out.println("product id:"+ product.getId());

            if (product.getId()!=0){
                productService.update(product);
            }
            else{
                System.out.println("Adding product");
                productService.add(product);
            }
            return "redirect:/product-list";
    }

    @GetMapping({"/delete-product"})
    public String delete(@RequestParam("id") Integer id){
        productService.delete(id);
        return "redirect:/product-list";
    }
}
