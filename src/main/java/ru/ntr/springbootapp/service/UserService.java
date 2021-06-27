package ru.ntr.springbootapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.ntr.springbootapp.dto.ProductDto;
import ru.ntr.springbootapp.dto.UserDto;
import ru.ntr.springbootapp.model.Role;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<UserDto> findAll();

    UserDto findById(int id);

    UserDto save(UserDto userDto);

    void deleteById(int id);


}
