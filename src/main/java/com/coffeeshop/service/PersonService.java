package com.coffeeshop.service;

import com.coffeeshop.dao.PersonDao;
import com.coffeeshop.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Crawlers on 5/24/2017.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public Person addPerson(Person person){
        return personDao.add(person);
    }

    public Person update(Person person){
        return personDao.update(person);
    }

    public Person getById(Long id){
        return personDao.getById(id);
    }

    public List<Person> getAll(){
        return personDao.getAll();
    }

    public void delete(Long id){
        personDao.delete(id);
    }

    public Person login(Person person){
        return personDao.login(person);
    }
}
