package com.sudhakar.service.Impl;

import com.sudhakar.model.User;
import com.sudhakar.repositories.UserRepository;
import com.sudhakar.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private final static Logger USER_LOGGER= LoggerFactory.getLogger(UserServiceImpl.class);
    @Value("${kafka.producer.destination}")
    private String topic;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Integer saveUser(User user) {
        USER_LOGGER.info("SAVED User "+user);
        System.out.println("TOPIC !! "+topic);
        return userRepository.save(user).getId();
    }

    @Override
    public User getUserById(Integer id) {
        USER_LOGGER.info("User "+new User(id,"Sudhakar"));
        return userRepository.findById(id);
    }
}
