package com.Shophub2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Shophub2.Bean.User;
import com.Shophub2.DAO.UserDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		UserDAO dao = ctx.getBean(UserDAO.class);
		
		  int status = dao.add(new User(6, "Priti", "priti01@cpg.com", 988989000,
		  "abcd")); System.out.println(status);
		 
		User user=new User();
		user.setUserId(6);
		long status1 = dao.remove(user);
		System.out.println(status1);
		
		/*
		 * long status2=dao.update(5,"1120"); System.out.println(status2);
		 */
	}
}