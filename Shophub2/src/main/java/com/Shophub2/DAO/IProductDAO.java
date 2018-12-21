package com.Shophub2.DAO;

import java.util.List;

import com.Shophub2.Bean.Product;
import com.Shophub2.Bean.User;

public interface IProductDAO {
	public String get(long productId);

	public List<Product> getAll();

	public long add(Product product);

	public Product remove(long productId);

	public Product update(Product product);

	public boolean contains(long productId, String productName);
}
