package Buoi7_HR.MainProgram;

import java.util.Scanner;

import Buoi7_HR.entity.BaoVe;
import Buoi7_HR.entity.GiangVien;
import Buoi7_HR.entity.SinhVien;
import Buoi7_HR.entity.VeSinh;
import Buoi7_HR.entity2.LichGiangDay;
import Buoi7_HR.entity2.LichHoc;
import Buoi7_HR.entity2.LichTruc;
import Buoi7_HR.enumm.Chucvu;
import Buoi7_HR.singleton.BangLichGiangDay;
import Buoi7_HR.singleton.BangLichHoc;
import Buoi7_HR.singleton.BangLichTruc;
import Buoi7_HR.singleton.DsBaoVe;
import Buoi7_HR.singleton.DsGiangVien;
import Buoi7_HR.singleton.DsSinhVien;
import Buoi7_HR.singleton.DsVeSinh;

public class MainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luachon;
		System.out.println("Bam 1 de them vao lich cua nhan vien, giang vien, sinh vien");
		System.out.println("Bam 2 de in ra lich lam viec cua nhan vien, giang vien, sinh vien");
		luachon = sc.nextInt();
		while (luachon != 1 && luachon != 2) {
			System.out.println("Moi nhap lai");
			luachon = sc.nextInt();
		}
		if (luachon == 1) {
			int id, gioitinh, chucvu, age;
			String name;
			System.out.println("Moi ban nhap ID:");
			id = sc.nextInt();
			System.out.println("Moi ban nhap ten: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Moi ban nhap tuoi:");
			age = sc.nextInt();
			System.out.println("Moi ban nhap gioi tinh (voi 0.Nu; 1.Nam ; 2.Khac)");
			gioitinh = sc.nextInt();
			System.out.println("Moi ban nhap chuc vu (voi 0.Nhan vien; 1.Bao ve ; 2.Giang vien ; 3.Sinh vien)");
			chucvu = sc.nextInt();
			if (Chucvu.getChucvu(chucvu) == Chucvu.SINHVIEN) {
				int typesv, time, vt;
				System.out.println("Nhap loai sinh vien (voi 0.Chinh quy; 1.Lien thong; 2.Tai chuc)");
				typesv = sc.nextInt();
				if (!DsSinhVien.isValid(id)) {
					DsSinhVien.addDsSinhVien(new SinhVien(id, name, age, gioitinh, chucvu, typesv));
				}
				System.out.println("Nhap thoi gian hoc (voi 1.Tiet 1; 2.Tiet 2; 3.Tiet 3; 4.Tiet 4; 5.Tiet 5)");
				time = sc.nextInt();
				System.out.println(
						"Nhap vi tri hoc (1.Phong A01; 2.Phong A02; 3.Phong A03); 4.Phong B01; 5.Phong B02; 6.Phong B03");
				vt = sc.nextInt();
				if (!BangLichHoc.isValid(id, time)) {
					BangLichHoc.addToBangLichHoc(new LichHoc(id, time, vt));
				}
			}
			if (Chucvu.getChucvu(chucvu) == Chucvu.GIANGVIEN) {
				int time, vt;
				if (!DsGiangVien.isValid(id)) {
					DsGiangVien.addToDsGiangVien(new GiangVien(id, name, age, gioitinh, chucvu));
				}
				System.out.println("Nhap thoi gian day (voi 1.Tiet 1; 2.Tiet 2; 3.Tiet 3; 4.Tiet 4; 5.Tiet 5)");
				time = sc.nextInt();
				System.out.println(
						"Nhap vi tri day (1.Phong A01; 2.Phong A02; 3.Phong A03); 4.Phong B01; 5.Phong B02; 6.Phong B03");
				vt = sc.nextInt();
				if (!BangLichGiangDay.isValid(id, time)) {
					BangLichGiangDay.addToBangLichGiangDay(new LichGiangDay(id, time, vt));
				}
			}
			if (Chucvu.getChucvu(chucvu) == Chucvu.VESINH) {
				int time, vt;
				if (!DsVeSinh.isValid(id)) {
					DsVeSinh.addDsVeSinh(new VeSinh(id, name, age, gioitinh, chucvu));
				}
				System.out.println("Nhap thoi gian lam viec (voi 1.Tiet 1; 2.Tiet 2; 3.Tiet 3; 4.Tiet 4; 5.Tiet 5)");
				time = sc.nextInt();
				System.out.println(
						"Nhap vi tri lam viec (1.Cong bao ve; 2.Nha ve sinh; 3.Nha A; 4.Nha B; 5.Nha C; 6.Nha D");
				vt = sc.nextInt();
				if (!BangLichTruc.isValid(id, time)) {
					BangLichTruc.addToBangLichTruc(new LichTruc(id, time, vt));
				}
			}
			if (Chucvu.getChucvu(chucvu) == Chucvu.BAOVE) {
				int time, vt;
				if (!DsBaoVe.isValid(id)) {
					DsBaoVe.addDsBaoVe(new BaoVe(id, name, age, gioitinh, chucvu));
				}
				System.out.println("Nhap thoi gian lam viec (voi 1.Tiet 1; 2.Tiet 2; 3.Tiet 3; 4.Tiet 4; 5.Tiet 5)");
				time = sc.nextInt();
				System.out.println(
						"Nhap vi tri lam viec (1.Cong bao ve; 2.Nha ve sinh; 3.Nha A; 4.Nha B; 5.Nha C; 6.Nha D");
				vt = sc.nextInt();
				if (!BangLichTruc.isValid(id, time)) {
					BangLichTruc.addToBangLichTruc(new LichTruc(id, time, vt));
				}
			}
		} else {
			int id;
			System.out.println("Nhap ID cua nguoi ban muon tim");
			id=sc.nextInt();
			System.out.println("Thong tin");
			if (!DsGiangVien.getGiangVien(id)) {
				System.out.println("Ban da nhap sai");
			}
			else if (!DsVeSinh.getVeSinh(id)) {
				System.out.println("Ban da nhap sai");
			}
			else if (!DsBaoVe.getBaoVe(id)) {
				System.out.println("Ban da nhap sai");
			}
			else if (!DsGiangVien.getGiangVien(id)) {
				System.out.println("Ban da nhap sai");
			}
			else {
				System.out.println("Ban da nhap sai");
			}
		}
	}

}
