package org.tasks.management.controller;


import dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.tasks.management.service.UserService;
import validation.OnCreate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private  UserService userService;


    @GetMapping("/create")
    public String returnText(){
        return "Hello";
    }


    @PostMapping("/create")
    public String createUser(@RequestBody @Validated(OnCreate.class)UserDto userDto){
  return "HELLO WORLD";
//     return new ResponseEntity<>(ResponseBuilder.buildResponse(userService.createUser(userDto)),HttpStatus.CREATED);
    }
}
