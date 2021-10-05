package Buoi5_Book.entity;

public class VanHoc extends Book {
	private int taiBan;

	public VanHoc(String tacgia, int price, int quantity, int taiBan) {
		super(tacgia, price, quantity);
		this.taiBan = taiBan;
	}

	public int getTaiBan() {
		return taiBan;
	}

	public void setTaiBan(int taiBan) {
		this.taiBan = taiBan;
	}
}
