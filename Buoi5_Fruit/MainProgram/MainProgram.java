package Buoi5_Fruit.MainProgram;

import java.util.List;
import java.util.Scanner;

import Buoi5_Fruit.entity.Apple;
import Buoi5_Fruit.entity.Banana;
import Buoi5_Fruit.entity.Fruit;
import Buoi5_Fruit.entity.Orange;
import Buoi5_Fruit.singleton.Inventory;
import Buoi5_Fruit.singleton.Cart;

public class MainProgram {
	public static void main(String[] args) {
		int luachon, chon2 = 1, chon3 = 1;
		Inventory.addToInventory(new Apple("Tao My", 100, 5, 20));
		Inventory.addToInventory(new Apple("Tao Tau", 50, 1, 10));
		Inventory.addToInventory(new Apple("Tao Uc", 200, 7, 20));

		Inventory.addToInventory(new Orange("Cam sanh", 70, 7, 20));
		Inventory.addToInventory(new Orange("Cam My", 80, 3, 20));
		Inventory.addToInventory(new Orange("Cam Sanh", 100, 4, 50));

		Inventory.addToInventory(new Banana("Chuoi My", 50, 15, 0.01));
		Inventory.addToInventory(new Banana("Chuoi tieu", 30, 10, 0.01));
		Inventory.addToInventory(new Banana("Chuoi ngu", 40, 20, 0.05));

		List<Fruit> a = Inventory.getInstance();
		System.out.println("Hay nhap yeu cau cua ban ");
		System.out.println("Bam 1 de in ra thong tin cac loai qua");
		System.out.println("Bam 2 de them vao gio hang cua ban <dung cho khach hang>");
		System.out.println("Bam 3 de them qua vao kho <dung cho quan ly>");
		Scanner scan = new Scanner(System.in);
		luachon = scan.nextInt();
		while (luachon != 1 && luachon != 2 && luachon != 3) {
			System.out.println("Ban da nhap sai, moi nhap lai");
			luachon = scan.nextInt();
		}
		if (luachon == 1) {
			System.out.println("Thong tin cac loai qua: ");
			for (Fruit i : a) {
				System.out.printf(i.getId() + "  " + i.getName() + "  " + "Gia tien: " + i.getPrice()
						+ " nghin dong/kg  So luong: " + i.getQuantity() + " kg");
				if (i instanceof Banana) {
					Banana casted = (Banana) i;
					System.out.println("  Luong Kali: " + casted.getKali());
				} else if (i instanceof Apple) {
					Apple casted = (Apple) i;
					System.out.println("  Luong duong: " + casted.getSugar());
				} else if (i instanceof Orange) {
					Orange casted = (Orange) i;
					System.out.println("  Can nang: " + casted.getWeight());
				}
			}
		} else if (luachon == 2) {
			int id, quantity;
			System.out.println("Thong tin cac loai qua co trong kho la: ");
			for (Fruit i : a) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + "Gia tien: " + i.getPrice()
						+ " nghin dong/kg  So luong: " + i.getQuantity() + " kg");
			}
			while (chon2 == 1) {
				System.out.println("Nhap ma loai qua ban muon them vao gio: ");
				id = scan.nextInt();
				System.out.println("Nhap so luong ban muon them vao gio: ");
				quantity = scan.nextInt();
				if (Cart.addToCart(id, quantity) == false) {
					System.out.println("Khong them duoc vao gio hang, moi ban kiem tra lai thong tin");
				}
				System.out.println("Bam 1 de mua them");
				System.out.println("Bam 0 dung viec mua sam");
				chon2 = scan.nextInt();
			}
			System.out.println("Thong tin cac loai qua con lai trong kho la:");
			for (Fruit i : a) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + "Gia tien: "
						+ i.getPrice() + " nghin dong/kg  So luong: " + i.getQuantity() + " kg");
			}

		} else if (luachon == 3) {
			int id, quantity;
			System.out.println("Thong tin cac loai qua co trong kho la: ");
			for (Fruit i : a) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + "Gia tien: " + i.getPrice()
						+ " nghin dong/kg  So luong: " + i.getQuantity() + " kg");
			}
			while (chon3 == 1) {
				System.out.println("Nhap ma loai qua sach muon them vao kho: ");
				id = scan.nextInt();
				System.out.println("Nhap so luong ban muon them vao kho: ");
				quantity = scan.nextInt();
				if (Inventory.addQuantitytoInventory(id, quantity) == false) {
					System.out.println("Khong them duoc vao gio hang, moi ban kiem tra lai thong tin");
				}
				System.out.println("Bam 1 de tiep tuc them");
				System.out.println("Bam 0 dung viec them");
				chon3 = scan.nextInt();
			}
			System.out.println("Thong tin cac loai qua co trong kho sau khi them la: ");
			for (Fruit i : a) {
				System.out.println(i.getId() + "  " + i.getName() + "  " + "Gia tien: "
						+ i.getPrice() + " nghin dong/kg  So luong: " + i.getQuantity() + " kg");
			}
		}
	}
}
