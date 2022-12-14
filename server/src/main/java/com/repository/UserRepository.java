package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.User;


@Repository 
public interface UserRepository extends JpaRepository<User, Long>
{
  
  @Query
  ("Select u from User u WHERE u.email = ?1")
  public User getUserByEmail(String email);
  
}
 