package org.melf.controller;
//管理员登录控制
import javax.servlet.http.HttpServletRequest;

import org.melf.entity.User;
import org.melf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class AdminLoginController {
	@Autowired
	UserService userService;
	
	//处理登录请求
		@RequestMapping("/main_user")
		public String login(String u1_num, String u1_password,HttpServletRequest request){
			// 验证账号和密码
			// 账号密码正确则登录成功，否则返回首页
			User user = userService.findBynum2(u1_num);
			if(user==null){
				// 没有找到，返回用户登录界面
				request.setAttribute("errorMsg", "该管理员不存在");
				return "redirect:/405.jsp";
				
			}else{
				// 找到
				// 验证密码
				if(u1_password.equals(user.getU1_password())){
					// 验证成功
					// 将用户信息放入到session会话
					request.getSession().setAttribute("user", user);
						return "redirect:/main_user.jsp";
						//系统管理	
				}else{
					// 验证密码失败
					request.setAttribute("errorMsg", "用户密码错误");
					return "redirect:/404.jsp";
				}
			}		
		}
		
		

		
		
		
		
		@RequestMapping("/logout")
		// 处理系统用户退出
		public String logout(HttpServletRequest request){
			// 将用户从session会话中清除
			request.getSession().removeAttribute("main_user");
			// 重定向到登录
			return "redirect:"+request.getContextPath()+"/index.jsp";                
		}	
		
	}

