package ru.ntr.springbootapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ntr.springbootapp.model.Role;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;

    private String login;

    private String password;

    private List<Role> roles;

}
