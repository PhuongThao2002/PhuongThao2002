package Fruit;

public class Cam extends Qua {
	int cannang;

	public Cam(String name, int gia, int soluong, int cannang) {
		super(name, gia, soluong);
		this.cannang = cannang;
	}

	public int getcannang() {
		return cannang;
	}

	public void setcannang(int cannang) {
		this.cannang = cannang;
	}

}
