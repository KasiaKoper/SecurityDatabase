package com.example.securitydatabase.repository;

import com.example.securitydatabase.model.User;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmail(String email);     //this automatically implements a method

}
