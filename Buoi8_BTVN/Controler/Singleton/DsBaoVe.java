package Buoi8_BTVN.Controler.Singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8_BTVN.Model.Entity_Human.BaoVe;
import Buoi8_BTVN.Model.Entity_Human.Info;

public class DsBaoVe {
	static private List<BaoVe> dsBaoVe = new ArrayList<BaoVe>();

	private DsBaoVe() {
	}

	public List<BaoVe> getInstance() {
		return dsBaoVe;
	}

	static public boolean addToDsBaoVe(BaoVe baoVe) {
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
