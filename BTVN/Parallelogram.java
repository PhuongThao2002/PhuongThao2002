package BTVN;

import java.util.Scanner;

public class Parallelogram
{
	double cd,cc,cb;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Chieu dai canh day la: ");
		cd = scan.nextDouble();
		System.out.println("Chieu dai canh ben la: ");
		cb = scan.nextDouble();
		System.out.println("Chieu cao la: ");
		cc = scan.nextDouble();
	}
	public double Cv()
	{
		return 2*(cd+cb);
	}
	public double Dt()
	{
		return cd*cc;
	}
//	public static void main(String[] args) 
//	{
//		Parallelogram hbh = new Parallelogram();
//		hbh.input();
//		System.out.println("Chu vi hinh binh hanh la: "+(2*(hbh.cd+hbh.cb))+" Va Dien tich hinh binh hanh la: "+(hbh.cd*hbh.cc));
//	}
}
