package Buoi8_BTVN.View.Untils;

import java.util.Scanner;

public class ScannerUntil {
	public static int readInt(Scanner scanner, int min, int max) {
		while (true) {
			try {
				int a = Integer.parseInt(scanner.nextLine());
				if (a < min || a > max) {
					System.out.println("Mời bạn nhập lại: ");
				} else
					return a;
			} catch (Exception e) {
				System.out.println("Ban phai nhap so!");
			}
		}
	}

	public static String readString(Scanner scanner) {
		while (true) {
			try {
			int kt=0;
			String name = scanner.nextLine();
			for (int i = 0; i <= name.length() - 1; i++) {
				if ((name.charAt(i) - 0 < 64 && name.charAt(i)>32) || name.charAt(i) - 0 > 90)  {
					System.out.println("Moi ban nhap lai ten bang chu cai in hoa");
					kt = 1;
					break;
				}
			}
			if (kt==0) return name;
			} catch (Exception e) {
				System.out.println("Ban phai nhap ten bang chu cai in hoa!");;
			}
		}
	}
}
