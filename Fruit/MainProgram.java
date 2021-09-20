package Fruit;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		ArrayList<Qua> listQua = new ArrayList<Qua>();
		listQua.add(new Tao("Tao Viet", 11, 22, 33));
		listQua.add(new Tao("Tao My", 10, 42, 13));
		listQua.add(new Tao("Tao Anh", 11,15, 23));
		
		listQua.add(new Cam("Cam Viet", 10, 22, 5));
		listQua.add(new Cam("Cam My", 11, 12, 3));
		listQua.add(new Cam("Cam Sanh", 12, 20, 10));
		
		listQua.add(new Chuoi("Chuoi Ngu", 2, 20, 39));
		listQua.add(new Chuoi("Chuoi Tieu", 2, 20, 27));
		listQua.add(new Chuoi("Chuoi Tau", 2, 20, 38));
		
		int money, i, chon, sl;
		System.out.println("Yeu cau nguoi dung la: ");
		System.out.println("Bam 1 de dua ra thong tin 3 loai qua");
		System.out.println("Bam 2 de tinh so qua nhieu nhat mua duoc");
		Scanner scan = new Scanner(System.in);
		chon = scan.nextInt();
		while (chon != 1 && chon != 2) {
			System.out.println("Ban da chon sai, moi chon lai");
			chon = scan.nextInt();
		}
		if (chon == 1) {
			i = 0;
			while (i <listQua.size() ) {
				System.out.println(listQua.get(i).getname());
				System.out.println(" Gia la " + listQua.get(i).getgia() + " nghin dong/kg");
				System.out.println(" So luong la " + listQua.get(i).getsoluong() + " kg");
				if (listQua.get(i) instanceof Tao) {
					Tao casted = (Tao) listQua.get(i);
					System.out.println(" Luong duong la " + casted.getluongduong());
				} else if (listQua.get(i) instanceof Cam) {
					Cam casted = (Cam) listQua.get(i);
					System.out.println(" Can nang la " + casted.getcannang());
				} else {
					Chuoi casted = (Chuoi) listQua.get(i);
					System.out.println(" Khoi luong dong vi Kali la " + casted.getkali());
				}
				i++;
			}
		} else if (chon == 2) {
			System.out.println("So tien ban co la (don vi nghin dong): ");
			money = scan.nextInt();
			for (i = 0; i < listQua.size(); i++) {
				System.out.print("Mua duoc so luong toi da: ");
				sl = (int) Math.min(money / listQua.get(i).getgia(), listQua.get(i).getsoluong());
				System.out.println(sl + " qua " + listQua.get(i).getname());
			}
		}
	}
}
