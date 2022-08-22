package com.spring.study.study;

import com.spring.study.study.user.dao.UserDao;
import com.spring.study.study.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		UserDao userDao = new UserDao();

		User user = new User();
		user.setId("taeyang");
		user.setName("이태양");
		user.setPassword("1210");

		userDao.add(user);

		System.out.println(user.getId()+"add");

		User user2 = userDao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId()+"select");

//		SpringApplication.run(StudyApplication.class, args);
	}

}
