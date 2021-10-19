package Buoi8_BTVN.Controler.Singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi8_BTVN.Model.Entity_Human.Info;
import Buoi8_BTVN.Model.Entity_Human.SinhVien;

public class DsSinhVien {
	static private List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();

	private DsSinhVien() {
	}

	public List<SinhVien> getInstance() {
		return dsSinhVien;
	}

	static public boolean addToDsSinhVien(SinhVien sinhVien) {
		dsSinhVien.add(sinhVien);
		return true;
	}

	static public boolean isValid(int id) {
		for (SinhVien i : dsSinhVien) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public boolean getSinhVien(int id) {
		for (SinhVien i : dsSinhVien) {
			if (i.getId() == id) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + i.getAge() + "  " + i.getGioiTinh() + "  "
						+ i.getChucVu());
				return true;
			}
		}
		return false;
	}

//	static public Info getSinhVien(int id) {
//		return dsSinhVien.get(id-1);
//	}
}
