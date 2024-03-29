package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.domain.User;

/**
 * 用户管理的Service的接口
 * @author hjz
 *
 */
public interface UserService {

	void regist(User user);

	User login(User user);

	List<User> findAll();

}
