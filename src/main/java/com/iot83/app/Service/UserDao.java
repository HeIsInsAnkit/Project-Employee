package com.iot83.app.Service;

import com.iot83.app.Entitty.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String> {

}
