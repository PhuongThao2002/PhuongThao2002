package BTVN;

import java.util.Scanner;

public class Square 
{
	double c;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Chieu dai canh la: ");
		c = scan.nextDouble();
	}
	public double Cv()
	{
		return c*4;
	}
	public double Dt()
	{
		return c*c;
	}
//	public static void main(String[] args) 
//	{
//		Square hv = new Square();
//		hv.input();
//		System.out.println("Chu vi hinh vuong la: "+(hv.c*4)+" Va Dien tich hinh vuong la: "+(hv.c*hv.c));
//	}
}