package com.coffeeshop.controller;

import com.coffeeshop.model.Address;
import com.coffeeshop.model.Person;
import com.coffeeshop.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

/**
 * Created by Crawlers on 5/24/2017.
 */
@Controller
@SessionAttributes("loggedUser")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping({"/signup", "/update-person"})
    public String signup(@RequestParam(value="id", required = false) Long id, Model model){
        if (id!=null){
            model.addAttribute("person", personService.getById(id));
        }
        return "signup";
    }

    @PostMapping({"/signup"})
    public String addUser(Person person, Address address, Model model){
        System.out.println("person:"+person);
        System.out.println("address:"+address);
        person.setAddress(address);
        if (!person.getPassword().equals(person.getRePassword())){
            model.addAttribute("errorMsg", "Password Confirmation didnt matched");
            model.addAttribute("person", person);
            return "signup";
        }else {
            if (person.getId()!=0){
                personService.update(person);
            }
            else{
                System.out.println("Adding user person");
                personService.addPerson(person);
            }
            return "redirect:/list-user";
        }
    }

    @PostMapping({"/add_person"})
    public String addPerson(Person person){
        personService.addPerson(person);
        return "redirect:/list-user";
    }

    @GetMapping({"/login"})
    public String login(){
        return "login";
    }

    @PostMapping({"/login"})
    public String login(String email, String password, Model model){
        Person person = personService.login(new Person(email, password));
        System.out.println("person:"+person);
        if (person!=null){
            model.addAttribute("loggedUser", person);
            return "redirect:/product-list";
        }else {
            model.addAttribute("errorMsg", "Username or password is incorrect.");
            return "login";
        }
    }

    @GetMapping({"/logout"})
    public String logout(Model model, SessionStatus status){
        status.setComplete();
        //store.cleanupAttribute(request, "loggedUser");
        return "redirect:/product-list";
    }

    @GetMapping({"/list-user"})
    public String listUser(Model model){
        List<Person> persons = personService.getAll();
        System.out.println("list:"+persons);
        model.addAttribute("persons", persons);
        return "list-user";
    }

    @GetMapping({"/delete-person"})
    public String delete(@RequestParam("id") Long id){
        personService.delete(id);
        return "redirect:/list-user";
    }
}
