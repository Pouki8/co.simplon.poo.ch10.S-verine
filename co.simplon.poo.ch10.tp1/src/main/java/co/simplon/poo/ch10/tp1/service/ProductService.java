package co.simplon.poo.ch10.tp1.service;





public interface ProductService {

	void changePrice(String name, int OldPrice, int newPrice) throws Exception;

	void changeQuantity(String name, int quantity) throws Exception;
}
