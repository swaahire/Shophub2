package com.Shophub2.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Shophub2.Bean.User;

public class UserDAO implements IUserDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public String get(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int add(User user) {
		String query = "insert into customer values('" + user.getUserId() + "','" + user.getUserName() + "','"
				+ user.getEmail() + "','" + user.getContact() + "','" + user.getPassword() + "')";
		return jdbcTemplate.update(query);
	}

	public long remove(User user) {
		String query = "delete from customer where userId='" + user.getUserId() + "' ";
		return jdbcTemplate.update(query);
	}

	public boolean contains(long userId, String userName) {

		return false;
	}

	public long update(long userId, String password) {

		String query = "update customer set password = ? where userId = ?";

		return jdbcTemplate.update(query, password, userId);

	}

}
