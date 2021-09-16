package BTVN;

import java.util.Scanner; 

public class Rhombus 
{
	double canh,cheo1,cheo2;
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Do dai canh la: ");
		canh = scan.nextDouble();
		System.out.println("Do dai 2 duong cheo la: ");
		cheo1 = scan.nextDouble();
		cheo2 = scan.nextDouble();
	}
	public double Cv()
	{
		return canh*4;
	}
	public double Dt()
	{
		return cheo1*cheo2/2;
	}
//	public static void main(String[] args) 
//	{
//		Rhombus ht = new Rhombus();
//		ht.input();
//		System.out.println("Chu vi hinh thoi la: "+(ht.canh*4)+" Va Dien tich hinh thoi la: "+(ht.cheo1*ht.cheo2/2));
//	}
}
