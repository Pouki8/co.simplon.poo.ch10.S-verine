package co.simplon.poo.ch10.tp1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor

public class Product {

	private String name;

	private int price;

	private int quantity;
	
	private boolean available;

	public Object getPrice;


}
