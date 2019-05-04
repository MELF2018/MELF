package org.melf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.melf.entity.User;
import org.melf.dao.UserDao;;

/**
 * 只做业务逻辑处理
 * @author zhangxiaoyu
 * @param <UserDao>
 *
 */
@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public User findBynum(String U1_num){
		User user = null;
		try{
			user = userDao.findBynum (U1_num);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public User findBynum2(String U1_num) {
		User user = null;
		try{
			user = userDao.findBynum2 (U1_num);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	

}
