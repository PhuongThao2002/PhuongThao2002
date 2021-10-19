package Buoi8_BTVN.View.Output;

import java.util.Scanner;

import Buoi8_BTVN.Controler.Singleton.*;
import Buoi8_BTVN.View.Untils.ScannerUntil;

public class Output {
	static public void OutputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID cua nguoi ban muon tim thong tin:");
		int id = ScannerUntil.readInt(sc, 0, 50);
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
