package Buoi5_Book.entity;

public class KhoaHoc extends Book {
	private int year;

	public KhoaHoc(String tacgia, int price, int quantity, int year) {
		super(tacgia, price, quantity);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
