package service;

import model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    void delete(Long id);

    User getById(Long id);
}