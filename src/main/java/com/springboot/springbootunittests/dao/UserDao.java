package com.springboot.springbootunittests.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public String getUser() {
        return "Mohtadi Nasri";
    }
}
