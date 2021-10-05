package Buoi5_Book.entity;

public class NgoaiVan extends Book {
	private String maSo;

	public NgoaiVan(String tacgia, int price, int quantity, String maSo) {
		super(tacgia, price, quantity);
		this.maSo = maSo;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

}
