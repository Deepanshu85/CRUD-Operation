package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    //ResponseEntity<User> → This method returns a response wrapped in a ResponseEntity.
    //User → The response body will contain a User object.
    //@PathVariable tells Spring Boot to extract the {id}
    // from the URL and pass it to the method as a variable
  //  @RequestBody tells Spring Boot to take the JSON body from the request
    //  and convert it into a User object.
   // User userDetails → A User object that contains the new values (name, email, etc.).
    //ResponseEntity.ok(...) returns an HTTP 200 OK
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        User updatedUser = userService.updateUser(id, userDetails);
        return ResponseEntity.ok(updatedUser);
    }

    //ResponseEntity.noContent() returns an HTTP 204 No Content response,
    // meaning the deletion was successful but there’s nothing to return in the response body.
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}
