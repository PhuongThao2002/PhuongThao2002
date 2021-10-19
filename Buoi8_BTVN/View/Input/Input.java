package Buoi8_BTVN.View.Input;

import java.util.Scanner;

import Buoi8_BTVN.Model.Entity_Human.*;
import Buoi8_BTVN.Model.Entity_Lich.*;
import Buoi8_BTVN.Model.Enum.*;
import Buoi8_BTVN.View.Untils.ScannerUntil;
import Buoi8_BTVN.Controler.Singleton.*;

public class Input {
	static Scanner sc = new Scanner(System.in);

	static public int khoangthoigian() {
		System.out.println("Nhap thoi gian: ");
		System.out.println("1.Tiet 1   2.Tiet 2   3.Tiet 3   4.Tiet 4   5.Tiet 5");
		int time = ScannerUntil.readInt(sc, 1, 5);
		return time;
	}

	static public int cacphonghoc() {
		System.out.println("Nhap phong hoc: ");
		System.out.println("1.Phong A101  2.Phong A102  3.Phong A103  4.Phong B101  5.Phong B102  6.Phong B103");
		int vt = ScannerUntil.readInt(sc, 1, 5);
		return vt;
	}

	static public int cacvitritruc() {
		System.out.println("Nhap vi tri truc");
		System.out.println("1.Cong bao ve  2.Nha ve sinh  3.Nha A   4.Nha B  5.Nha C  6.Nha D");
		int vt = ScannerUntil.readInt(sc, 1, 5);
		return vt;
	}

	static public void InputLichGiangDay(int id) {
		int tg = khoangthoigian();
		int vt = cacphonghoc();
		Time time = Time.gettime(tg);
		PhongHoc ph = PhongHoc.getPhonghoc(vt);
		if (BangLichGiangDay.isValid(tg, vt) == false) {
			BangLichGiangDay.addToBangLichGiangDay(new LichGiangDay(id, time, ph));
		}
	}

	static public void InputLichHoc(int id) {
		int tg = khoangthoigian();
		int vt = cacphonghoc();
		Time time = Time.gettime(tg);
		PhongHoc ph = PhongHoc.getPhonghoc(vt);
		if (BangLichHoc.isValid(tg, vt) == false) {
			BangLichHoc.addToBangLichHoc(new LichHoc(id, time, ph));
		}
	}

	static public void InputLichTruc(int id) {
		int tg = khoangthoigian();
		int vt = cacvitritruc();
		Time time = Time.gettime(tg);
		ViTriTruc truc = ViTriTruc.getVitritruc(vt);
		if (BangLichTruc.isValid(tg, vt) == false) {
			BangLichTruc.addToBangLichTruc(new LichTruc(id, time, truc));
		}
	}

	static public void InputInfo() {
		System.out.println("Nhap ID:");
		int id = ScannerUntil.readInt(sc, 1, 50);
		System.out.println("Nhap ten:");
		String name = ScannerUntil.readString(sc);
		System.out.println("Nhap tuoi:");
		int age = ScannerUntil.readInt(sc, 19, 65);
		System.out.println("Nhap gioi tinh:");
		System.out.println("0. Nu       1.Nam         2.Khac");
		int gt = ScannerUntil.readInt(sc, 0, 2);
		System.out.println("Nhap chuc vu:");
		System.out.println("0.Ve sinh  1.Bao ve  2.Giang vien  3.Sinh vien");
		int cv = ScannerUntil.readInt(sc, 0, 3);
		Gioitinh gioiTinh = Gioitinh.getGioitinh(gt);
		Chucvu chucVu = Chucvu.getChucvu(cv);
		if (chucVu == Chucvu.GV) {
			if (DsGiangVien.isValid(id) == false) {
				DsGiangVien.addToDsGiangVien(new GiangVien(id, name, age, gioiTinh, chucVu));
			}
			InputLichGiangDay(id);
		} else if (chucVu == Chucvu.SV) {
			System.out.println("Nhap loai sinh vien:");
			System.out.println("1. Chinh quy  2.Lien thong  3.Tai chuc");
			int typesv = ScannerUntil.readInt(sc, 1, 3);
			TypeSv type = TypeSv.getTypeSv(typesv);
			if (DsSinhVien.isValid(id) == false) {
				DsSinhVien.addToDsSinhVien(new SinhVien(id, name, age, gioiTinh, chucVu, type));
			}
			InputLichHoc(id);
		} else if (chucVu == Chucvu.BV) {
			if (DsBaoVe.isValid(id) == false) {
				DsBaoVe.addToDsBaoVe(new BaoVe(id, name, age, gioiTinh, chucVu));
			}
			InputLichTruc(id);
		} else {
			if (DsVeSinh.isValid(id) == false) {
				DsVeSinh.addToDsVeSinh(new VeSinh(id, name, age, gioiTinh, chucVu));
			}
			InputLichTruc(id);
		}
	}

}
