package com.github.perscholas.service;

import com.github.perscholas.model.User;
import com.github.perscholas.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUsers(){
      List<User> allUsers=new ArrayList<User>();
      userRepo.findAll().forEach(s -> allUsers.add(s));
        return allUsers;
    }

    public void addUser(User user){
        userRepo.save(user);
    }

}
