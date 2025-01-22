package org.tasks.management.service;

import dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto User);
    UserDto updateUser(UserDto userDto);
    UserDto deleteUser(UserDto userDto);
}
