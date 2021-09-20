package Fruit;

public class Chuoi extends Qua {
	int kali;

	public Chuoi(String name, int gia, int soluong, int kali) {
		super(name, gia, soluong);
		this.kali = kali;
	}

	public int getkali() {
		return kali;
	}

	public void setkali(int kali) {
		this.kali = kali;
	}
}
