package Buoi8_BTVN.Model.Entity_Lich;

import Buoi8_BTVN.Model.Enum.Time;
import Buoi8_BTVN.Model.Enum.ViTriTruc;

public class LichTruc extends LichLamViec {
	private ViTriTruc vt;

	public LichTruc(int id, Time time,ViTriTruc vt) {
		super(id,time);
		this.vt = vt;
	}

	public ViTriTruc getVt() {
		return vt;
	}

	public void setVt(ViTriTruc vt) {
		this.vt = vt;
	}
	public String toString() {
		return "Id: " + getId() +"	Thời gian: "+ getTime() + " 	Vị trí: "+ getVt(); 
	}
}