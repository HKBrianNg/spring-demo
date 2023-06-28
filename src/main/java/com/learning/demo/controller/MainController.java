package com.learning.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.demo.model.User;
import com.learning.demo.repository.UserRepository;

@Controller
@RequestMapping(path="/api")
public class MainController {

  @Autowired
  private UserRepository userRepository;

  // @PostMapping("/users")
  // public @ResponseBody String addNewUser(@RequestParam String name,@RequestParam String email) {
  //   User n = new User();
  //   n.setName(name);
  //   n.setEmail(email);
  //   userRepository.save(n);
  //   return "Saved";
  // }

  // @GetMapping(path="/users")
  // public @ResponseBody Iterable<User> getAllUsers() {
  //   return userRepository.findAll();
  // }

  @GetMapping(path="/users")
  public String getAllUsers() {
    return "how are you";
  }

}
