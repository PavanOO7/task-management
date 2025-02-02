package org.tasks.service;


import org.tasks.DTO.UserDTO;

public interface UserService {
    UserDTO createUser(UserDTO User);
    UserDTO updateUser(UserDTO userDto);
    UserDTO deleteUser(UserDTO userDto);
}
