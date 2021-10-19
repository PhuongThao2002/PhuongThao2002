package Buoi8_BTVN.Model.Entity_Lich;

import Buoi8_BTVN.Model.Enum.PhongHoc;
import Buoi8_BTVN.Model.Enum.Time;

public class LichHoc extends LichLamViec {
	private PhongHoc vt;

	public LichHoc(int id, Time time, PhongHoc vt) {
		super(id,time);
		this.vt = vt;
	}

	public PhongHoc getVt() {
		return vt;
	}

	public void setVt(PhongHoc vt) {
		this.vt = vt;
	}
	public String toString() {
		return "Id: " +getId() +"	Thời gian: " + getTime() + "	Phòng: " + getVt();
	}
}
