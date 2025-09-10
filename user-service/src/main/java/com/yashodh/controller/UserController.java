package com.yashodh.controller;

import com.yashodh.exception.UserException;
import com.yashodh.model.User;
import com.yashodh.repository.UserRepository;
import com.yashodh.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor

@RestController
public class UserController {


    private final UserService userService;


    @PostMapping("/api/user")
    public User createUser(@RequestBody @Valid User user){
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED).getBody();

    }


    @GetMapping("/api/user")
        public ResponseEntity <List<User>> getUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);

        }


    @GetMapping("/api/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId")Long id) throws Exception{
        User user = userService .getUserById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);

    }



    @PutMapping("/api/user/{id}")
     public User updateUser(@RequestBody User user, @PathVariable Long id) throws Exception {
        User updatedUser = userService.updateUser(id,user);
        return new ResponseEntity<>(updatedUser,HttpStatus.OK).getBody();

    }



    @DeleteMapping("/api/user/{id}")
    public ResponseEntity<String> deleteById (@PathVariable Long id) throws Exception {
        userService.deleteUser(id);
        return  new ResponseEntity<>("User deleted" , HttpStatus.ACCEPTED);



    }



}
