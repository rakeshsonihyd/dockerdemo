package com.login.demo.Service.Implementation;

import com.login.demo.Entity.User;
import com.login.demo.Repository.LoginRepository;
import com.login.demo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  LoginRepository loginRepository;
    @Override
    public Boolean insertLoginDetails(User userData) {
        User user = loginRepository.findByUserId(userData.getUserName());
        if (user.getPassword().equals(userData.getPassword())) {
            return true;
        }
     else{
         return false;
        }

    }

    @Override
    public List<User> getAllDetails() {
        List<User> userDetails = loginRepository.findAllUser();
        return userDetails;
    }
}