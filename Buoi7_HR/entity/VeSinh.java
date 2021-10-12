package Buoi7_HR.entity;

import Buoi7_HR.enumm.Chucvu;
import Buoi7_HR.enumm.Gioitinh;

public class VeSinh extends Info {
	private Gioitinh gt;
	private Chucvu cv;

	public VeSinh(int id, String name, int age, int gt, int cv) {
		super(id, name, age);
		this.cv = Chucvu.getChucvu(cv);
		this.gt = Gioitinh.getGioitinh(gt);
	}

	public Gioitinh getGioiTinh() {
		return gt;
	}

	public Chucvu getChucVu() {
		return cv;
	}
	
}
