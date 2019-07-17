package com.pramati.service;

import com.pramati.model.User;

public interface IUserService {

    Integer saveUser(User user);

    User getUserById(Integer id);
}
