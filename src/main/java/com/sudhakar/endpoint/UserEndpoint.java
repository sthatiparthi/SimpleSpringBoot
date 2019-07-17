package com.sudhakar.endpoint;

import com.sudhakar.model.User;
import com.sudhakar.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserEndpoint {
    private final static Logger USER_LOGGER= LoggerFactory.getLogger(UserEndpoint.class);
    @Autowired
    private IUserService userService;

    @GetMapping(path = "get",produces ="application/json",consumes = "application/json")
    public  void getUserById(@RequestParam("id") Integer id){
        USER_LOGGER.info("Start:getUserById Id :: "+id);
        userService.getUserById(id);
        USER_LOGGER.info("End:getUserById Id :: "+id);
    }

    @PostMapping(path = "/saveUser",produces = "application/json",consumes = "application/json")
    public @ResponseBody Integer saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
