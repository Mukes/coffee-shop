package com.coffeeshop.dao;

import com.coffeeshop.model.Person;
import com.coffeeshop.model.Product;
import com.coffeeshop.util.Constant;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Crawlers on 5/25/2017.
 */
@Component
public class ProductDao extends AbstractDao<Product>{
    public ProductDao() {
        super();
        baseUrl = Constant.PRODUCT_URL;
    }

    public Product add(Product product){
        return post(product, null);
    }

    public Product update(Product product){
        return post(product, "/"+ product.getId());
    }

    public Product getById(Integer id){
        return get("/"+id);
    }

    public List<Product> getAll(){
        return getList(null);
    }

    public void delete(Integer id){
        delete("/"+id);
    }

}
