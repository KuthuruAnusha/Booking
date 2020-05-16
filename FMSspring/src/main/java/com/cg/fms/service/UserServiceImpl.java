package com.cg.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.UserDao;

import com.cg.fms.entity.User;
import com.cg.fms.exception.UserException;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User findUserId(int uid) throws UserException {
		User us=null;
		if(userDao.existsById(uid))
		{
			us=userDao.findById(uid).get();
		}
		else
		{
			throw new UserException(uid+"ID NOT FOUND");
		}
		
		return us;
	}
}
