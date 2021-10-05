package Buoi6_Book.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi6_Book.entity.Book;

public class Inventory {
	static private List<Book> inventory = new ArrayList<Book>();

	private Inventory() {
	}

	static public List<Book> getInstance() {
		return inventory;
	}

	static public void addToInventory(Book book) {
		inventory.add(book);
	}

	static public boolean isValid(int id) {
		for (Book i : inventory) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	// tra ve Book dua tren id
	static public Book getBook(int id) {
		return inventory.get(id - 1);
	}

	static public boolean addQuantitytoInventory(int id, int quantity) {
		if (Inventory.isValid(id) == false) {
			return false;
		} else {
			Book temp = Inventory.getBook(id);
			int oldQuantity = temp.getQuantity();
			temp.setQuantity(oldQuantity + quantity);
		}
		return true;
	}
}
