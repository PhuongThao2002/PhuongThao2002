package Buoi7_HR.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_HR.entity.BaoVe;

public class DsBaoVe {
	static private List<BaoVe> dsBaoVe = new ArrayList<BaoVe>();

	private DsBaoVe() {
	}

	public List<BaoVe> getInstance() {
		return dsBaoVe;
	}

	static public boolean addDsBaoVe(BaoVe baoVe) {
		dsBaoVe.add(baoVe);
		return true;
	}

	static public boolean isValid(int id) {
		for (BaoVe i : dsBaoVe) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public boolean getBaoVe(int id) {
		for (BaoVe i : dsBaoVe) {
			if (i.getId() == id) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + i.getAge() + "  " + i.getGioiTinh() + "  "
						+ i.getChucVu());
				return true;
			}
		}
		return false;
	}
}
