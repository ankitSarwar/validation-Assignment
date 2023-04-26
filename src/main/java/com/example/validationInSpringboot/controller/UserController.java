package com.example.validationInSpringboot.controller;

import com.example.validationInSpringboot.model.User;
import com.example.validationInSpringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/Controller")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/addUser")
    public String addUser(@Valid @RequestBody User user)
    {
        return userService.addNew(user);
    }

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser()
    {
        return userService.getAll();
    }

    @GetMapping(value = "/getUser/{userid}")
    public User getUser(int userid)
    {
        return userService.getUserByid(userid);
    }

    @PutMapping(value = "updateUserInfo/{userid}")  //http://localhost:8080/Controller/getAllUser
    public String updateUserInfo(@PathVariable int userid, @RequestBody User user)
    {
        return userService.updateUser(userid,user);
    }

    @DeleteMapping(value = "/deleteUser/{userid}")
    public String deleteUser(@PathVariable int userid)
    {
        return userService.deleteUserById(userid);
    }


}
