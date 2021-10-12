package Buoi7_HR.entity;

import Buoi7_HR.enumm.Chucvu;
import Buoi7_HR.enumm.Gioitinh;
import Buoi7_HR.enumm.TypeSv;

public class SinhVien extends Info {
	private Gioitinh gt;
	private Chucvu cv;
	private TypeSv typesv;

	public SinhVien(int id, String name, int age, int gt, int cv, int typesv) {
		super(id, name, age);
		this.cv = Chucvu.getChucvu(cv);
		this.gt = Gioitinh.getGioitinh(gt);
		this.typesv = TypeSv.getTypeSv(typesv);
	}

	public TypeSv getTypesv() {
		return typesv;
	}

	public Gioitinh getGioiTinh() {
		return gt;
	}

	public Chucvu getChucVu() {
		return cv;
	}
}
