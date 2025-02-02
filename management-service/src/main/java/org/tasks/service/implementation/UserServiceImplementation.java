package org.tasks.service.implementation;

import org.springframework.stereotype.Service;
import org.tasks.DTO.UserDTO;
import org.tasks.UserRepository;
import org.tasks.dao.User;
import org.tasks.service.UserService;
import org.tasks.support.UserSupport;

@Service
public class UserServiceImplementation implements UserService {
   private final UserRepository userRepository;
    UserServiceImplementation(UserRepository userRepository){
     this.userRepository = userRepository;
    }
    @Override
    public UserDTO createUser(UserDTO userDto) {
      User user =   UserSupport.convertUserDtoToUser(userDto);
         return UserSupport.convertUserToUserDto(userRepository.save(user));
    }

    @Override
    public UserDTO updateUser(UserDTO userDto) {
        return null;
    }

    @Override
    public UserDTO deleteUser(UserDTO userDto) {
        return null;
    }
}
