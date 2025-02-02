package org.tasks.support;

import org.tasks.DTO.UserDTO;
import org.tasks.dao.User;

import java.util.Date;

public class UserSupport {
    public static UserDTO convertUserToUserDto(User user) {
        UserDTO userDto = new UserDTO();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setMiddleName(user.getMiddleName());
        userDto.setLastActive(user.getLastActive());
        return userDto;
    }
    public static User convertUserDtoToUser(UserDTO userDto) {
        User user = new User();

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setMiddleName(userDto.getMiddleName());
        user.setLastActive(userDto.getLastActive());
        user.setCreatedOn(new Date());
        user.setCreatedBy(userDto.getCreatedBy());
        user.setLastUpdatedOn(new Date());
        user.setLastUpdatedBy(userDto.getLastUpdatedBy());
        return user;
    }


}
