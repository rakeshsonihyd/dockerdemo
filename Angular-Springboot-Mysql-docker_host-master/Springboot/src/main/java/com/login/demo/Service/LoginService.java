package com.login.demo.Service;

import com.login.demo.Entity.User;

import java.util.List;

public interface LoginService {

    Boolean insertLoginDetails(User userData);

    public List<User> getAllDetails();

}