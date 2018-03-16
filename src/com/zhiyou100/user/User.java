package com.zhiyou100.user;


import java.sql.Timestamp;

public class User {
	private int user_id;
	private int department_id;
	private int role_id;
	private String username;
	private boolean is_male;
	private String mobile;
	private int age;
	private String address;
	private boolean is_admin;
	private boolean is_system;
	private String password;
	private String tel;
	private String id_num;
	private String email;
	private String hobby;
	private int education;
	private String card_num;
	private String nation;
	private int marry;
	private int status;
	private String remark;
	private Timestamp create_time;
	private int creater;
	private Timestamp update_time;
	private int updater;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isIs_male() {
		return is_male;
	}
	public void setIs_male(boolean is_male) {
		this.is_male = is_male;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean isIs_admin() {
		return is_admin;
	}
	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}
	public boolean isIs_system() {
		return is_system;
	}
	public void setIs_system(boolean is_system) {
		this.is_system = is_system;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId_num() {
		return id_num;
	}
	public void setId_num(String id_num) {
		this.id_num = id_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getEducation() {
		return education;
	}
	public void setEducation(int education) {
		this.education = education;
	}
	public String getCard_num() {
		return card_num;
	}
	public void setCard_num(String card_num) {
		this.card_num = card_num;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getMarry() {
		return marry;
	}
	public void setMarry(int marry) {
		this.marry = marry;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getCreater() {
		return creater;
	}
	public void setCreater(int creater) {
		this.creater = creater;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public int getUpdater() {
		return updater;
	}
	public void setUpdater(int updater) {
		this.updater = updater;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id 
				+ ", department_id=" + department_id 
				+ ", role_id=" + role_id 
				+ ", username=" + username 
				+ ", is_male=" + is_male 
				+ ", mobile=" + mobile 
				+ ", age=" + age 
				+ ", address=" + address
				+ ", is_admin=" + is_admin 
				+ ", is_system=" + is_system 
				+ ", password=" + password 
				+ ", tel=" + tel
				+ ", id_num=" + id_num 
				+ ", email=" + email 
				+ ", hobby=" + hobby 
				+ ", education=" + education
				+ ", card_num=" + card_num 
				+ ", nation=" + nation 
				+ ", marry=" + marry 
				+ ", status=" + status
				+ ", remark=" + remark 
				+ ", create_time=" + create_time 
				+ ", creater=" + creater 
				+ ", update_time=" + update_time 
				+ ", updater=" + updater + "]";
	}
	
	
	
	
	
	
}
