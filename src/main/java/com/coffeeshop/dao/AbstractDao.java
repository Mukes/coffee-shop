package com.coffeeshop.dao;

import com.coffeeshop.util.ReflectionUtil;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Crawlers on 5/24/2017.
 */
public class AbstractDao<T> {
    private RestTemplate restTemplate;
    public String baseUrl;

    private Class clazz;
    public AbstractDao() {
        this.restTemplate = new RestTemplate();
        try {
            this.clazz = ReflectionUtil.getClazz(this);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public T post(T t, String param){
        String  url = baseUrl;
        if (param!=null)
            url=baseUrl+param;
        T obj = (T) restTemplate.postForObject(url, t, clazz, "");
        return obj;
    }

   /* public T put(T t, String param){
        String  url = baseUrl;
        if (param!=null)
            url=baseUrl+param;
        T obj = (T) restTemplate.put(url, t, clazz, "");
        return obj;
    }*/

    public T get(String param){
        String  url = baseUrl;
        if (param!=null)
            url=baseUrl+param;
        T obj = (T) restTemplate.getForObject(url, clazz, "");
        return obj;
    }

    public List<T> getList(String param){
        String  url = baseUrl;
        if (param!=null)
            url=baseUrl+param;
        ResponseEntity<List<T>> response =
            restTemplate.exchange(url,
                HttpMethod.GET, null, new ParameterizedTypeReference<List<T>>() {
                });
        System.out.println("List:"+response.getBody());
        return response.getBody();
    }
    
    public void delete(String param){
        String  url = baseUrl;
        if (param!=null)
            url=baseUrl+param;
        restTemplate.delete(url);
    }
}
