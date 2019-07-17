package com.sudhakar;

import com.sudhakar.model.User;
import com.sudhakar.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest
{

    @Autowired
    private IUserService userService;
    @Before
    public void setUp(){
        Integer savedUserId=userService.saveUser(new User(23214,"Thatiparthi"));
        System.out.println("savedUserId "+savedUserId);
    }

    @Test
    public void saveUser()
    {
        User retrivedUser=userService.getUserById(43);
        System.out.println("Retrieved User "+retrivedUser);
        assertNotNull(retrivedUser);
    }
}
