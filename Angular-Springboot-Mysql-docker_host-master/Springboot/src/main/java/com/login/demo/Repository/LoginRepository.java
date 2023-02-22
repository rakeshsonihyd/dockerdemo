package com.login.demo.Repository;

import com.login.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<User,Integer>{

    @Query("select u from User u where u.userName =: userName")
    User findByUserId(@Param("userName")String userName);

    @Query("select u from User u")
    List<User> findAllUser();
}
