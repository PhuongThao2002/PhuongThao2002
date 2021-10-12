package Buoi7_HR.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_HR.entity.VeSinh;

public class DsVeSinh {
	static private List<VeSinh> dsVeSinh = new ArrayList<VeSinh>();

	private DsVeSinh() {
	}

	public List<VeSinh> getInstance() {
		return dsVeSinh;
	}

	static public boolean addDsVeSinh(VeSinh veSinh) {
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
}
