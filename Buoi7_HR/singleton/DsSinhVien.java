package Buoi7_HR.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_HR.entity.SinhVien;

public class DsSinhVien {
	static private List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();

	private DsSinhVien() {
	}

	public List<SinhVien> getInstance() {
		return dsSinhVien;
	}

	static public boolean addDsSinhVien(SinhVien sinhVien) {
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
}
