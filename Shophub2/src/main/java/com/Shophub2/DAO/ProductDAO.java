package com.Shophub2.DAO;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Shophub2.Bean.Product;

public class ProductDAO implements IProductDAO {

private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String get(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public long add(Product product) {
		 String query="insert into Product values('"+product.getProductId()+"','"+product.getProductName()+"','"+product.getProductPrice()+"')";  
		    return jdbcTemplate.update(query); 
	}

	public Product remove(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean contains(long productId, String productName) {
		// TODO Auto-generated method stub
		return false;
	}

}
