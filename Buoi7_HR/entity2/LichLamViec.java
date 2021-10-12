package Buoi7_HR.entity2;

import Buoi7_HR.enumm.Time;

public abstract class LichLamViec {
	private int id;

	public LichLamViec(int id) {
		this.id = id;
	}

	public abstract Time getTime();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
