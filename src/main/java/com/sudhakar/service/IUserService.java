package com.sudhakar.service;

import com.sudhakar.model.User;

public interface IUserService {

    Integer saveUser(User user);

    User getUserById(Integer id);
}
