package Buoi8_BTVN.Model.Entity_Human;

import Buoi8_BTVN.Model.Enum.Chucvu;
import Buoi8_BTVN.Model.Enum.Gioitinh;
import Buoi8_BTVN.Model.Enum.TypeSv;

public class SinhVien extends Info {
	private Gioitinh gt;
	private Chucvu cv;
	private TypeSv typesv;

	public SinhVien(int id, String name, int age, Gioitinh gt, Chucvu cv, TypeSv type) {
		super(id, name, age, gt, cv);
		this.typesv = type;
	}

	public TypeSv getTypesv() {
		return typesv;
	}

	public void setTypesv(TypeSv typesv) {
		this.typesv = typesv;
	}

	public Gioitinh getGioiTinh() {
		return gt;
	}

	public Chucvu getChucVu() {
		return cv;
	}
}
