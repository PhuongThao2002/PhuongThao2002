package BTVN;

import java.util.Scanner;

public class Triangle 
{
	double a,b,c;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Chieu dai 3 canh cua tam giac la: ");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
	}
	public double Dt()
	{
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public double Cv()
	{
		return a+b+c;
	}
//	public static void main(String[] args) 
//	{
//		Triangle htg = new Triangle() ;
//		htg.input();
//		System.out.println("Chu vi cua tam giac la: "+(htg.a+htg.b+htg.c)+" Va Dien tich cua tam giac la: "+(htg.Dt()));
//	}
}
