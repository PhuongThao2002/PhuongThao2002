package Buoi8_BTVN.Controler.Singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8_BTVN.Model.Entity_Lich.LichHoc;
import Buoi8_BTVN.Model.Entity_Lich.LichLamViec;
import Buoi8_BTVN.Model.Enum.Time;

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
