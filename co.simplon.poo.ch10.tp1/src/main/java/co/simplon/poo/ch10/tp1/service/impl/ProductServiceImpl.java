package co.simplon.poo.ch10.tp1.service.impl;

import co.simplon.poo.ch10.tp1.model.Product;
import co.simplon.poo.ch10.tp1.model.User;
import co.simplon.poo.ch10.tp1.repository.ProductRepository;
import co.simplon.poo.ch10.tp1.repository.UserRepository;
import co.simplon.poo.ch10.tp1.service.ProductService;


public class ProductServiceImpl implements ProductService{
	
	private final ProductRepository products;

	public ProductServiceImpl(ProductRepository products) {
		this.products = products;
	}

	@Override
	public void changePrice(String name, int OldPrice, int newPrice) throws Exception {
		// TODO Auto-generated method stub
		
	
	}

	@Override
	public void changeQuantity(String name, int quantity) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
