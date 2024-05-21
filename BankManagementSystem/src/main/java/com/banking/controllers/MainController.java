//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.banking.controllers;

import com.banking.entity.User;
import com.banking.services.AdminServices;
import com.banking.services.UserServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    UserServices userService;
    @Autowired
    AdminServices adminServices;

    public MainController() {
    }

    @GetMapping({"/allCustomers"})
    public List<User> getAllUsers() {
        return this.adminServices.getAllCustomers();
    }

    @GetMapping({"/getCustomerById/{id}"})
    public User getCustomerById(@PathVariable("id") int id) {
        return this.adminServices.getCustomerById(id);
    }

    @PostMapping({"/addUser"})
    public User addUser(@RequestBody User user) {
        this.adminServices.addUser(user);
        return user;
    }
}
