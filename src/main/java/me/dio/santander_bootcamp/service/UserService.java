package me.dio.santander_bootcamp.service;

import me.dio.santander_bootcamp.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
