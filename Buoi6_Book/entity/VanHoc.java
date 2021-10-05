package Buoi6_Book.entity;

public class VanHoc extends Book {
	private int taiBan;

	public VanHoc(String tacgia, int price, int quantity, int taiBan) {
		super(tacgia, price, quantity);
		this.taiBan = taiBan;
	}

	public void loaisach() {
		System.out.println("Sach Van Hoc");
	}

	public int getTaiBan() {
		return taiBan;
	}

	public void setTaiBan(int taiBan) {
		this.taiBan = taiBan;
	}
}
