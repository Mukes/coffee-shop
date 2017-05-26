package com.coffeeshop.dao;

import com.coffeeshop.model.Order;
import com.coffeeshop.util.Constant;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Crawlers on 5/25/2017.
 */
@Component
public class OrderDao extends AbstractDao<Order> {
    public OrderDao() {
        super();
        baseUrl = Constant.PERSON_URL;
    }

    public Order add(Order order){
        return post(order, null);
    }

    public Order update(Order order){
        return post(order, "/"+ order.getId());
    }

    public Order getById(Integer id){
        return get("/"+id);
    }

    public List<Order> getAll(){
        return getList(null);
    }

    public void delete(Integer id){
        delete("/"+id);
    }
}
