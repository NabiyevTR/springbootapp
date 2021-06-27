package ru.ntr.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ntr.springbootapp.model.Customer;
import ru.ntr.springbootapp.model.Role;
import ru.ntr.springbootapp.model.User;

import java.util.List;


public interface RoleRepository extends JpaRepository<Role, Integer> {

    List<Role> findRoleById(int id);
}