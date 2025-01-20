package service.implementation;

import service.UserService;
import dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    @Override
    public UserDto createUser(UserDto UserDto) {


      return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto deleteUser(UserDto userDto) {
        return null;
    }
}
