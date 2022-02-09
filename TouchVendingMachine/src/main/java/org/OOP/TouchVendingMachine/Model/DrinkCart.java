package org.OOP.TouchVendingMachine.Model;

public class DrinkCart extends Drink {
	
	//int id;

	public DrinkCart(int id,String name, String size, int price, int quantily, String type) {
		super(id,name, size, price, quantily, type);
		//this.id = id;
		// TODO Auto-generated constructor stub
	}

	public int amount() {
		return getQuantily() * getPrice();
	}
}
