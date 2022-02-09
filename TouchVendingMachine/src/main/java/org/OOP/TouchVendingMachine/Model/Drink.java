package org.OOP.TouchVendingMachine.Model;

public class Drink {
	private int id;
	private String name;
	private String size;
	private int price;
	private int quantily;
	private String type;
    //static private int count;
	public Drink(int id,String name, String size, int price, int quantily, String type) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
		this.quantily = quantily;
		this.type = type;
	}
	
	//public abstract int amount();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantily() {
		return quantily;
	}
	public void setQuantily(int quantily) {
		this.quantily = quantily;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	/*public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Drink.count = count;
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
