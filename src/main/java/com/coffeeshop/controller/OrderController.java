package com.coffeeshop.controller;

import com.coffeeshop.model.Order;
import com.coffeeshop.service.OrderService;
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
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/order-list")
    public String orderList(Model model){
        List<Order> orders = orderService.getAll();
        System.out.println("list:"+orders);
        model.addAttribute("orders", orders);
        return "order-list";
    }

    @GetMapping("/order-add")
    public String orderAdd(@RequestParam(value="id", required = false) Integer id, Model model){
        if (id!=null){
            model.addAttribute("product", orderService.getById(id));
        }
        return "order-add";
    }

    @PostMapping({"/order-add"})
    public String add(Order order, Model model){
        System.out.println("order:"+ order);

        if (order.getId()!=0){
            orderService.update(order);
        }
        else{
            System.out.println("Adding order");
            orderService.addPerson(order);
        }
        return "order-list";
    }

    @GetMapping({"/delete-order"})
    public String delete(@RequestParam("id") Integer id){
        orderService.delete(id);
        return "redirect:/order-list";
    }
}
