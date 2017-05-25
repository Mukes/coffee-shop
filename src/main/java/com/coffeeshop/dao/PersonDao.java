package com.coffeeshop.dao;

import com.coffeeshop.model.Person;
import com.coffeeshop.util.Constant;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Crawlers on 5/24/2017.
 */
@Component
public class PersonDao extends AbstractDao<Person>{

    public PersonDao() {
        super();
        baseUrl = Constant.PERSON_URL;
    }

    public Person add(Person person){
        return post(person, null);
    }

    public Person update(Person person){
        return post(person, "/"+person.getId());
    }

    public Person getById(Long id){
        return get("/"+id);
    }

    public List<Person> getAll(){
        return getList(null);
    }

    public void delete(Long id){
        delete("/"+id);
    }

    public Person login(Person person){
        return post(person, "/login");
    }
}
