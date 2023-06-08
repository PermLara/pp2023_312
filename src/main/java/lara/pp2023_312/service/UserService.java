package lara.pp2023_312.service;

import lara.pp2023_312.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    User findById(Long id);

    User saveUser(User user);

    void deleteById(Long id);
}
