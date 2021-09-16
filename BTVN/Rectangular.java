package BTVN;

import java.util.Scanner;

public class Rectangular 
{
	double cd, cr;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Chieu dai la: ");
		cd = scan.nextDouble();
		System.out.println("Chieu rong la: ");
		cr = scan.nextDouble();
	}
	public double Cv()
	{
		return (cd+cd)*2;
	}
	public double Dt()
	{
		return (cd*cr);
	}
//	public static void main(String[] args) 
//	{
//		Rectangular hcn = new Rectangular();
//		hcn.input();
//		System.out.println("Chu vi hinh chu nhat la: "+(2*(hcn.cd+hcn.cr))+" Va Dien tich hinh chu nhat la: "+(hcn.cd*hcn.cr));
//	}
}
