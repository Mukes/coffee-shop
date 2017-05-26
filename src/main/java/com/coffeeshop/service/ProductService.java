package com.coffeeshop.service;

import com.coffeeshop.dao.ProductDao;
import com.coffeeshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Crawlers on 5/25/2017.
 */
@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public Product add(Product product){
        return productDao.add(product);
    }

    public Product update(Product product){
        return productDao.update(product);
    }

    public Product getById(Integer id){
        return productDao.getById(id);
    }

    public List<Product> getAll(){
        return productDao.getAll();
    }

    public void delete(Integer id){
        productDao.delete(id);
    }
}
