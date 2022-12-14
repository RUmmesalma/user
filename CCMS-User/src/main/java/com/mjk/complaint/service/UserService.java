package com.mjk.complaint.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.mjk.complaint.entity.User;
@Service
public interface UserService {
	public List<User> getAllUsers()throws Exception;
	public User insertUser(User user)throws Exception;
	public User getUserByName(String userName)throws Exception;
	public String deleteUser(String userName) throws Exception;
	public List<User> getUserByRole(String role) throws Exception;
	}
