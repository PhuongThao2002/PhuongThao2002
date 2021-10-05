package Buoi5_Book.MainProgram;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Buoi5_Book.entity.Book;
import Buoi5_Book.entity.KhoaHoc;
import Buoi5_Book.entity.NgoaiVan;
import Buoi5_Book.entity.VanHoc;
import Buoi5_Book.singleton.Inventory;
import Buoi5_Book.singleton.Cart;

public class MainPro {
	public static void main(String[] args) {
		int luachon, chon2 = 1, chon3 = 1;
		Inventory.addToInventory(new VanHoc("Nguyen Van An", 30, 10, 11));
		Inventory.addToInventory(new VanHoc("Bui Ngoc Anh", 100, 1, 10));
		Inventory.addToInventory(new VanHoc("Pham Van Minh", 70, 6, 14));

		Inventory.addToInventory(new KhoaHoc("Tran Duc Quang", 50, 7, 2020));
		Inventory.addToInventory(new KhoaHoc("Nguyen Thi Thanh", 150, 3, 2017));
		Inventory.addToInventory(new KhoaHoc("Pham Van Binh", 70, 15, 2021));

		Inventory.addToInventory(new NgoaiVan("Tran Thi Uyen", 150, 4, "MS01"));
		Inventory.addToInventory(new NgoaiVan("Tran Thi Uyen", 90, 7, "MS02"));
		Inventory.addToInventory(new NgoaiVan("Tran Thi Uyen", 200, 40, "MS03"));

		List<Book> a = Inventory.getInstance();
		System.out.println("Hay nhap yeu cau cua ban ");
		System.out.println("Bam 1 de in ra thong tin cac loai sach");
		System.out.println("Bam 2 de them vao gio hang cua ban <dung cho khach hang>");
		System.out.println("Bam 3 de them qua vao kho <dung cho quan ly>");
		Scanner scan = new Scanner(System.in);
		luachon = scan.nextInt();
		while (luachon != 1 && luachon != 2 && luachon != 3) {
			System.out.println("Ban da nhap sai, moi nhap lai");
			luachon = scan.nextInt();
		}
		if (luachon == 1) {
			System.out.println("Thong tin cac loai sach: ");
			for (Book i : a) {
				System.out.printf(i.getId() + "  " + "Tac gia: " + i.getTacgia() + "  " + "Gia tien" + "  "
						+ i.getPrice() + " nghin dong/quyen  So luong: " + i.getQuantity() + " quyen");
				if (i instanceof KhoaHoc) {
					KhoaHoc casted = (KhoaHoc) i;
					System.out.println("  Xuat ban nam: " + casted.getYear());
				} else if (i instanceof NgoaiVan) {
					NgoaiVan casted = (NgoaiVan) i;
					System.out.println("  Ma so ISBN: " + casted.getMaSo());
				} else if (i instanceof VanHoc) {
					VanHoc casted = (VanHoc) i;
					System.out.println("  Tai ban lan thu: " + casted.getTaiBan());
				}
			}
		} else if (luachon == 2) {
			int id, quantity;
			System.out.println("Thong tin cac loai sach co trong kho la: ");
			for (Book i : a) {
				System.out.println(i.getId() + "  " + "Tac gia: " + i.getTacgia() + "  " + "Gia tien" + "  "
						+ i.getPrice() + " nghin dong/quyen  So luong: " + i.getQuantity() + " quyen");
			}
			while (chon2 == 1) {
				System.out.println("Nhap ma loai sach ban muon them vao gio: ");
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
			System.out.println("Thong tin cac loai sach con lai trong kho la:");
			for (Book i : a) {
				System.out.println(i.getId() + "  " + "Tac gia: " + i.getTacgia() + "  " + "Gia tien" + "  "
						+ i.getPrice() + " nghin dong/quyen  So luong: " + i.getQuantity() + " quyen");
			}

		} else if (luachon == 3) {
			int id, quantity;
			System.out.println("Thong tin cac loai sach co trong kho la: ");
			for (Book i : a) {
				System.out.println(i.getId() + "  " + "Tac gia: " + i.getTacgia() + "  " + "Gia tien" + "  "
						+ i.getPrice() + " nghin dong/quyen  So luong: " + i.getQuantity() + " quyen");
			}
			while (chon3 == 1) {
				System.out.println("Nhap ma loai sach muon them vao kho: ");
				id = scan.nextInt();
				System.out.println("Nhap so luong ban muon them vao kho: ");
				quantity = scan.nextInt();
				if (Inventory.addQuantitytoInventory(id, quantity) == false) {
					System.out.println("Khong them duoc vao kho, moi ban kiem tra lai thong tin");
				}
				System.out.println("Bam 1 de tiep tuc them");
				System.out.println("Bam 0 dung viec them");
				chon3 = scan.nextInt();
			}
			System.out.println("Thong tin cac loai sach co trong kho sau khi them la: ");
			for (Book i : a) {
				System.out.println(i.getId() + "  " + "Tac gia: " + i.getTacgia() + "  " + "Gia tien" + "  "
						+ i.getPrice() + " nghin dong/quyen  So luong: " + i.getQuantity() + " quyen");
			}
		}
	}
}
