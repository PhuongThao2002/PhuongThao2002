package Buoi6_Fruit.singleton;

import java.util.Map;
import java.util.HashMap;

import Buoi6_Fruit.entity.Fruit;

public class Cart {
	static private Map<Integer, Integer> cart = new HashMap<Integer, Integer>();;

	private Cart() {
	}

	static public Map<Integer, Integer> getInstance() {
		return cart;
	}

	static public boolean addToCart(int id, int quantity) {
		// Kiem tra id
		if (Inventory.isValid(id) == false) {
			return false;
		}
		// Kiem tra so luong
		Fruit temp = Inventory.getFruit(id);
		if (temp.getQuantity() < quantity) {
			return false;
		} else {
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity - quantity);
		}
		// Them vao cart
		// Kiem tra Key co ton tai k
		if (cart.containsKey(id)) {
			int oldQuantity = cart.get(id);
			cart.put(id, oldQuantity + quantity);
		} else {
			cart.put(id, quantity);
		}
		return true;
	}
}
