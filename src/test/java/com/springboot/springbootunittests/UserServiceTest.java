package com.springboot.springbootunittests;

import com.springboot.springbootunittests.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class) // @RunWith: integrate spring with junit
@SpringBootTest(classes = {SpringBootUnitTestsApplication.class}) // @SpringBootTest: this class is spring boot test.
public class UserServiceTest {
    @Resource
    private UserService userService;



    @Test
    public void testGetValidUser() {
        Assert.assertEquals(userService.getUser(), "Mohtadi Nasri");
    }

    @Test
    public void testGetWrongUser() {
        Assert.assertNotEquals(userService.getUser(), "MohtadiNasri");
    }

    @Test
    public void testGetWrongUsers() {
        Assert.assertEquals(userService.getUser(), "MohtadiNasri");
    }
}
