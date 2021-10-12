package Buoi7_HR.singleton;

import java.util.ArrayList;
import java.util.List;

import Buoi7_HR.entity.GiangVien;

public class DsGiangVien {
	static private List<GiangVien> dsGiangVien = new ArrayList<GiangVien>();

	private DsGiangVien() {
	}

	public List<GiangVien> getInstance() {
		return dsGiangVien;
	}

	static public boolean addToDsGiangVien(GiangVien giangVien) {
		dsGiangVien.add(giangVien);
		return true;
	}

	static public boolean isValid(int id) {
		for (GiangVien i : dsGiangVien) {
			if (i.getId() == id) {
				return true;
			}
		}
		return false;
	}

	static public boolean getGiangVien(int id) {
		for (GiangVien i : dsGiangVien) {
			if (i.getId() == id) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + i.getAge() + "  " + i.getGioiTinh() + "  "
						+ i.getChucVu());
				return true;
			}
		}
		return false;
	}
}
