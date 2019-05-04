package org.melf.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.melf.entity.User;

import com.wdzl.dao.BloggerSqlProvider;
import com.wdzl.entity.Blogger;




@Mapper
public interface UserDao {
	// 查找所有用户信息
	@Select("select * from user where r_id = 1")
	public List<User> findAll();
	
	//根据id查找
	@Select("select * from user where U1_num=#{U1_num}")
	public User findBynum(String U1_num);
	
	//根据昵称查找
	@Select("select count(*)  user where U1_name=#{U1_name}")
	public int countByName(String U1_name);
	
	//增加数据
	@Insert("insert into user (U1_num) values(#{U1_num})")
	public void save(User user);
	
	//增加数据
	@Insert("insert into user (U1_num,U1_password) values(#{U1_num},#{U1_password})")
	public void register(User user);
	
	// 编辑保存
	@Update("update blogger set bloggerNickname=#{bloggerNickname},email=#{email},sex=#{sex},old=#{old},nation=#{nation},education=#{education},hobby=#{hobby},marriage=#{marriage}  where bloggerID=#{bloggerID}")
	public void update(Blogger  blogger);
	
	
	// 编辑保存
	@Update("update blogger set bloggerPassword=#{bloggerPassword}  where bloggerID=#{bloggerID}")
	public void update1(Blogger  blogger);
	
	// 根据id删除数据
	@Delete("delete from blogger where bloggerID =#{bloggerID}")
	public void delete(String bloggerID);
	
	// 使用动态的sql
	
	@SelectProvider(type=BloggerSqlProvider.class,method="findByLikeName")
	public List<Blogger> findByLikeName(String bloggerNickname);

	
	//根据条件进行查询
	// 动态sql 
	@SelectProvider(type=BloggerSqlProvider.class,method="findByMap")
	public List<Blogger> findByMap(Map<String, String> map);
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
}
