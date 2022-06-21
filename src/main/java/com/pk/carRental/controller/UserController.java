package com.pk.carRental.controller;

import com.pk.carRental.model.User;
import com.pk.carRental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;
    public UserController(UserService userService) {
        this.userService =  userService;
    }

    public UserController() {

    }

    @PostMapping("/add")
    public  String add(@RequestBody User user){

        userService.saveUser(user);
        return "new user has been added";
    }
    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/get/{id}")
    public List<User> getUser(@PathVariable("id")Long id){
        return userService.getUser(id);
    }
    @DeleteMapping("/delete/{id}")

    public void deleteUser(@PathVariable("id")Long id){
        userService.deleteUser(id);

    }



}
