package Buoi8_BTVN.Controler.MainProgram;

import java.util.Scanner;

import Buoi8_BTVN.View.Input.Input;
import Buoi8_BTVN.View.Output.Output;
import Buoi8_BTVN.View.Untils.ScannerUntil;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yeu cau cua ban la:");
		System.out.println("1. Them thong tin:");
		System.out.println("2. In ra thong tin:");
		int chon = ScannerUntil.readInt(sc, 1, 2);
		if (chon==1) {
			Input.InputInfo();
		}
		else {
			Output.OutputInfo();
		}
	}
}
