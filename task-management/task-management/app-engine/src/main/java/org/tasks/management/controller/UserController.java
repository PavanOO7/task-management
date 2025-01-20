package org.tasks.management.controller;


import dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tasks.management.applicationResponse.ResponseBuilder;
import org.tasks.management.models.TaskManagementResponse;
import service.UserService;
import validation.OnCreate;

@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<TaskManagementResponse> createUser(@RequestBody @Validated(OnCreate.class)UserDto userDto){

     return new ResponseEntity<>(ResponseBuilder.buildResponse(userService.createUser(userDto)),HttpStatus.CREATED);
    }
}
