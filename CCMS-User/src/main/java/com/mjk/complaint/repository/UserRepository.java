package com.mjk.complaint.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mjk.complaint.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, UserCustomRepository 
{

	

}
