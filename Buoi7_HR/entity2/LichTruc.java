package Buoi7_HR.entity2;

import Buoi7_HR.enumm.ViTriTruc;
import Buoi7_HR.enumm.Time;

public class LichTruc extends LichLamViec {
	private ViTriTruc vt;
	private Time time;

	public LichTruc(int id, int time, int vt) {
		super(id);
		this.vt = ViTriTruc.getVitritruc(vt);
		this.time = Time.gettime(time);
	}

	public ViTriTruc getVitriTruc() {
		return vt;
	}

	public Time getTime() {
		return time;
	}

}
