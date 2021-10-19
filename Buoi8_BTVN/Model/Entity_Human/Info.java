package Buoi8_BTVN.Model.Entity_Human;

import Buoi8_BTVN.Model.Enum.Chucvu;
import Buoi8_BTVN.Model.Enum.Gioitinh;

public abstract class Info {

	private int id;
	private String name;
	private int age;
	Gioitinh gt;
	Chucvu cv;
	static private int count;

	public Info(int id, String name, int age, Gioitinh gt, Chucvu cv) {
		this.name = name;
		this.age = age;
		this.gt = gt;
		this.cv = cv;
		// this.id=++count;
	}

	public abstract Chucvu getChucVu();

	public abstract Gioitinh getGioiTinh();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
