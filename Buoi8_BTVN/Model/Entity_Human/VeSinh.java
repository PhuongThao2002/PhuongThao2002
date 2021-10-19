package Buoi8_BTVN.Model.Entity_Human;

import Buoi8_BTVN.Model.Enum.Chucvu;
import Buoi8_BTVN.Model.Enum.Gioitinh;

public class VeSinh extends Info {
	private Gioitinh gt;
	private Chucvu cv;

	public VeSinh(int id, String name, int age, Gioitinh gt, Chucvu cv) {
		super(id, name, age, gt, cv);
	}

	public Gioitinh getGioiTinh() {
		return gt;
	}

	public Chucvu getChucVu() {
		return cv;
	}

}