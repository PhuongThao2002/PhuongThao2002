package BTVN;

import java.util.Scanner; 

public class Student 
{
	double toan, ly, age;
	String ten,lop;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ten hoc sinh la: ");
		ten = scan.nextLine();
		System.out.println("Hoc sinh lop: ");
		lop = scan.nextLine();
		System.out.println("Nam sinh: ");
		age = scan.nextDouble();
		System.out.println("Diem Toan la: ");
		toan = scan.nextDouble();
		System.out.println("Diem Ly la: ");
		ly = scan.nextDouble();
	}
    public double diemtb()
    {
    	return ((toan+ly)/2);
    }
}
