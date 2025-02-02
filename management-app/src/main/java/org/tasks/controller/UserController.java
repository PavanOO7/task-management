package org.tasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tasks.DTO.UserDTO;
import org.tasks.applicationResponse.ResponseBuilder;
import org.tasks.models.TaskManagementResponse;
import org.tasks.service.UserService;
import org.tasks.validation.OnCreate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<TaskManagementResponse> createUser(@RequestBody @Validated(OnCreate.class) UserDTO userDto){
        return new ResponseEntity<>(ResponseBuilder.buildResponse(userService.createUser(userDto)), HttpStatus.CREATED);
    }
}
