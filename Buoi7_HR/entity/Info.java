package Buoi7_HR.entity;

import Buoi7_HR.enumm.Chucvu;
import Buoi7_HR.enumm.Gioitinh;

public abstract class Info {

	private int id;
	private String name;
	private int age;

	public Info(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
