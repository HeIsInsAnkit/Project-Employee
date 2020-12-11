package com.iot83.app.Service;

import com.iot83.app.Entitties.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceBody implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserDetails() {
        List<User> list = new ArrayList<>();
        for(User user : userDao.findAll()) {
            list.add(user);
        }
        return list;
    }

    @Override
    public User getSingleUser(String userId) {
        return userDao.findById(userId).get();
    }

    @Override
    public User addUser(User userDetails) {
        userDao.save(userDetails);
        return userDetails;
    }

    @Override
    public User updateUser(User userDetails) {
        userDao.save(userDetails);
        return userDetails;
    }

    @Override
    public void deleteUser(String userId) {
        userDao.deleteById(userId);
    }


}
