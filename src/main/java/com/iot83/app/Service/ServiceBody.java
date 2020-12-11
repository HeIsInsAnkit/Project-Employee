package com.iot83.app.Service;

import com.iot83.app.Entitty.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceBody implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserDetails() {
        return userDao.findAll();
    }

    @Override
    public User getSingleUser(String userId) {
        return userDao.getOne(userId);
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
        userDao.delete(userDao.getOne(userId));
    }


}
