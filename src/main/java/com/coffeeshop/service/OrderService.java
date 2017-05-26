package com.coffeeshop.service;

import com.coffeeshop.dao.OrderDao;
import com.coffeeshop.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Crawlers on 5/25/2017.
 */
@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public Order addPerson(Order order){
        return orderDao.add(order);
    }

    public Order update(Order order){
        return orderDao.update(order);
    }

    public Order getById(Integer id){
        return orderDao.getById(id);
    }

    public List<Order> getAll(){
        return orderDao.getAll();
    }

    public void delete(Integer id){
        orderDao.delete(id);
    }

}
