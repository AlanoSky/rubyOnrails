package com.zhiyou100.user;



public interface UserDao extends BaseDao<User> {

	public User searchByID(int id);
	
	public User searchByUsername(String username);

}
