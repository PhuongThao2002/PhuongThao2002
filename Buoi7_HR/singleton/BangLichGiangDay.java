package Buoi7_HR.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_HR.entity2.LichGiangDay;
import Buoi7_HR.enumm.PhongHoc;
import Buoi7_HR.enumm.Time;

public class BangLichGiangDay {
	static private List<LichGiangDay> bangLichGiangDay = new ArrayList<LichGiangDay>();

	private BangLichGiangDay() {
	}

	static public List<LichGiangDay> getBangLichGiangDay() {
		return bangLichGiangDay;
	}

	static public void addToBangLichGiangDay(LichGiangDay lichGiangDay) {
		bangLichGiangDay.add(lichGiangDay);
	}

	static public boolean isValid(int id, int time) {
		for (LichGiangDay i : bangLichGiangDay) {
			if (i.getId() == id && i.getTime() == Time.gettime(time)) {
				return true;
			}
		}
		return false;
	}

	static public LichGiangDay getLichGiangDay(int id) {
		for (LichGiangDay i : bangLichGiangDay) {
			if (i.getId() == id)
				return i;
		}
		return null;
	}
}
