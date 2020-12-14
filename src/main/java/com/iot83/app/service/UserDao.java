package com.iot83.app.service;

import com.iot83.app.entitties.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User,String> {

}
