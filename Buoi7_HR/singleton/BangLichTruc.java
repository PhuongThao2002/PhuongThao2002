package Buoi7_HR.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_HR.entity2.LichTruc;
import Buoi7_HR.enumm.PhongHoc;
import Buoi7_HR.enumm.Time;

public class BangLichTruc {
	static private List<LichTruc> bangLichTruc = new ArrayList<LichTruc>();

	private BangLichTruc() {
	}

	static public List<LichTruc> getBangLichTruc() {
		return bangLichTruc;
	}

	static public void addToBangLichTruc(LichTruc lichTruc) {
		bangLichTruc.add(lichTruc);
	}

	static public boolean isValid(int id, int time) {
		for (LichTruc i : bangLichTruc) {
			if (i.getId() == id && i.getTime() == Time.gettime(time)) {
				return true;
			}
		}
		return false;
	}

	static public LichTruc getLichHoc(int id) {
		for (LichTruc i : bangLichTruc) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
