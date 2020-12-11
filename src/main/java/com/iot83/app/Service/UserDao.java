package com.iot83.app.Service;

import com.iot83.app.Entitty.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,String> {

}
