package Buoi7_HR.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_HR.entity.SinhVien;
import Buoi7_HR.entity2.LichHoc;
import Buoi7_HR.entity2.LichLamViec;
import Buoi7_HR.enumm.PhongHoc;
import Buoi7_HR.enumm.Time;

public class BangLichHoc {
	static private List<LichHoc> bangLichHoc = new ArrayList<LichHoc>();

	private BangLichHoc() {
	}

	static public List<LichHoc> getBangLichHoc() {
		return bangLichHoc;
	}

	static public void addToBangLichHoc(LichHoc lichHoc) {
		bangLichHoc.add(lichHoc);
	}

	static public boolean isValid(int id, int time) {
		for (LichHoc i : bangLichHoc) {
			if (i.getId() == id && i.getTime() == Time.gettime(time)) {
				return true;
			}
		}
		return false;
	}

	static public LichHoc getLichHoc(int id) {
		for (LichHoc i : bangLichHoc) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
