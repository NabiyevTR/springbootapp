package ru.ntr.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ntr.springbootapp.model.User;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();

    User findUserByLogin(String login);

    User findById(int id);

}
