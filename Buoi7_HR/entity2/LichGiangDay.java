package Buoi7_HR.entity2;

import Buoi7_HR.enumm.PhongHoc;
import Buoi7_HR.enumm.Time;

public class LichGiangDay extends LichLamViec {
	private PhongHoc vt;
	private Time time;

	public LichGiangDay(int id, int time, int vt) {
		super(id);
		this.vt = PhongHoc.getPhonghoc(vt);
		this.time = Time.gettime(time);
	}

	public PhongHoc getPhongHoc() {
		return vt;
	}

	public Time getTime() {
		return time;
	}

}
