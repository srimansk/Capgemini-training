package com.example;

import org.springframework.transaction.annotation.Transactional;

public class ProductService {
	
	private ProductDao dao;
		
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	@Transactional
	public void updateTwoProducts() {
		dao.updatePrice(55, 202);
		int x = 10/2;
		dao.updatePrice(75, 203);
	}
}
