package Buoi8_BTVN.Model.Entity_Lich;

import Buoi8_BTVN.Model.Enum.Time;

public abstract class LichLamViec {
	private int id;
	private Time time;

	public LichLamViec(int id,Time time) {
		this.id = id;
		this.time=time;
	}

	public int getId() {
		return id;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
}