package com.sudhakar.repositories;

import com.sudhakar.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findById(Integer id);

}
