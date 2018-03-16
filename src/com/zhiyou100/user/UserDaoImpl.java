package com.zhiyou100.user;

import java.util.List;


public class UserDaoImpl implements UserDao {

	@Override
	public void add(User e) {
		String sql = "insert into user values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,now(),?,null,?)";
		JDBCUtil.dbDMLWithSQL(sql, e.getDepartment_id(),e.getRole_id(),e.getUsername(),e.isIs_male(),e.getMobile(),e.getAge(),e.getAddress(),e.isIs_admin(),e.isIs_system(),e.getPassword(),e.getTel(),e.getId_num(),e.getEmail(),e.getHobby(),e.getEducation(),e.getCard_num(),e.getNation(),e.getMarry(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater());
		
		
	}

	@Override
	public void deleteById(int e) {
		// TODO Auto-generated method stub
		
		String sql = "delete from user where user_id =?";
		JDBCUtil.dbDMLWithSQL(sql,e);
	}

	@Override
	public void update(User e) {
		// TODO Auto-generated method stub
		String sql = "update user set department_id=?, role_id=?, username=?, is_male=?, mobile=?, age=?, address=?, is_admin=?, is_system=?, password=?, tel = ?,id_num=?, email=?, hobby=?, education=?, card_num=?, nation=?, marry=?, status=?, remark=?, create_time=now(), creater=?, update_time=now(), updater=? where user_id = ?";
		JDBCUtil.dbDMLWithSQL(sql,e.getDepartment_id(),e.getRole_id(),e.getUsername(),e.isIs_male(),e.getMobile(),e.getAge(),e.getAddress(),e.isIs_admin(),e.isIs_system(),e.getPassword(),e.getTel(),e.getId_num(),e.getEmail(),e.getHobby(),e.getEducation(),e.getCard_num(),e.getNation(),e.getMarry(),e.getStatus(),e.getRemark(),e.getCreater(),e.getUpdater(),e.getUser_id());
	}

	@Override
	public List<User> selectAll() {
		String sql = "select * from user";
		return JDBCUtil.dbDQLWithSQL(sql, User.class);
	}

	@Override
	public User searchByID(int id) {
		String sql = "select * from user where user_id=?";
		List<User> user = JDBCUtil.dbDQLWithSQL(sql, User.class, id);
		return user.get(0);
	}

	@Override
	public User searchByUsername(String username) {
		String sql ="select * from user where username =?";
		List<User> users = JDBCUtil.dbDQLWithSQL(sql, User.class, username);
		// TODO Auto-generated method stub
		if (users.size() == 0) {
			return null;
		}else {
			return users.get(0);
		}
		/*if(user==null) {
			//
			return null;
		}else{
			if() {
				
				
			}
			
		}*/
	}

}
