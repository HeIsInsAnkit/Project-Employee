package com.iot83.app.service;

import com.iot83.app.entitties.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,String> {

    @Query("FROM User  where email=:email")
    User findByEmail(@Param("email") String email);

}
