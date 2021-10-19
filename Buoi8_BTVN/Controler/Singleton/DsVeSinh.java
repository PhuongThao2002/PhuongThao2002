package Buoi8_BTVN.Controler.Singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8_BTVN.Model.Entity_Human.Info;
import Buoi8_BTVN.Model.Entity_Human.VeSinh;


public class DsVeSinh {
	static private List<VeSinh> dsVeSinh = new ArrayList<VeSinh>();

	private DsVeSinh() {
	}

	public List<VeSinh> getInstance() {
		return dsVeSinh;
	}

	static public boolean addToDsVeSinh(VeSinh veSinh) {
		dsVeSinh.add(veSinh);
		return true;
	}

	static public boolean isValid(int id) {
		for (VeSinh i : dsVeSinh) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public boolean getVeSinh(int id) {
		for (VeSinh i : dsVeSinh) {
			if (i.getId() == id) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + i.getAge() + "  " + i.getGioiTinh() + "  "
						+ i.getChucVu());
				return true;
			}
		}
		return false;
	}

//	static public Info getVeSinh(int id) {
//		return dsVeSinh.get(id-1);
//	}
}
