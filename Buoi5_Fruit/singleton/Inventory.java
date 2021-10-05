package Buoi5_Fruit.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi5_Fruit.entity.Fruit;

public class Inventory {
	static private List<Fruit> inventory = new ArrayList<Fruit>();

	private Inventory() {
	}

	static public List<Fruit> getInstance() {
		return inventory;
	}

	static public void addToInventory(Fruit fruit) {
		inventory.add(fruit);
	}

	static public boolean isValid(int id) {
		for (Fruit i : inventory) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	//tra ve Fruit dua tren id
	static public Fruit getFruit(int id) {
		return inventory.get(id - 1);
	}
	static public boolean addQuantitytoInventory(int id, int quantity) {
		if (Inventory.isValid(id) == false) {
			return false;
		} else {
			Fruit temp = Inventory.getFruit(id);
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity + quantity);
		}
		return true;
	}
}
