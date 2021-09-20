package Fruit;

public class Tao extends Qua {
	int luongduong;

	public Tao(String name, int gia, int soluong, int luongduong) {
		super(name, gia, soluong);
		this.luongduong = luongduong;
	}

	public int getluongduong() {
		return luongduong;
	}

	public void setluongduong(int luongduong) {
		this.luongduong = luongduong;
	}

}
