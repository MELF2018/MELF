package org.melf.entity;

public class User {
	private String U1_num;
	private String U1_password;
	private String U1_name;
	private String U1_sex;
	private int age;
	private String U1_phone;
	private String U1_address;
	private String U1_jointime;
	private String R_id;
	public String getU1_num() {
		return U1_num;
	}
	public void setU1_num(String u1_num) {
		U1_num = u1_num;
	}
	public String getU1_password() {
		return U1_password;
	}
	public void setU1_password(String u1_password) {
		U1_password = u1_password;
	}
	public String getU1_name() {
		return U1_name;
	}
	public void setU1_name(String u1_name) {
		U1_name = u1_name;
	}
	public String getU1_sex() {
		return U1_sex;
	}
	public void setU1_sex(String u1_sex) {
		U1_sex = u1_sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getU1_phone() {
		return U1_phone;
	}
	public void setU1_phone(String u1_phone) {
		U1_phone = u1_phone;
	}
	public String getU1_address() {
		return U1_address;
	}
	public void setU1_address(String u1_address) {
		U1_address = u1_address;
	}
	public String getU1_jointime() {
		return U1_jointime;
	}
	public void setU1_jointime(String u1_jointime) {
		U1_jointime = u1_jointime;
	}
	public String getR_id() {
		return R_id;
	}
	public void setR_id(String r_id) {
		R_id = r_id;
	}
	/**
	 * @param u1_num
	 * @param u1_password
	 * @param u1_name
	 * @param u1_sex
	 * @param age
	 * @param u1_phone
	 * @param u1_address
	 * @param u1_jointime
	 * @param r_id
	 */
	public User(String u1_num, String u1_password, String u1_name, String u1_sex, int age, String u1_phone,
			String u1_address, String u1_jointime, String r_id) {
		super();
		U1_num = u1_num;
		U1_password = u1_password;
		U1_name = u1_name;
		U1_sex = u1_sex;
		this.age = age;
		U1_phone = u1_phone;
		U1_address = u1_address;
		U1_jointime = u1_jointime;
		R_id = r_id;
	}
	
	
	
	

}
