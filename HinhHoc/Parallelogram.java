package HinhHoc;

import java.util.Scanner;
import java.util.ArrayList;

public class Parallelogram extends Input
{
	protected float a;
	public Parallelogram(int n)
	{
		super(n);
		Scanner sc = new Scanner(System.in);
		System.out.println("Do dai chieu cao la: ");
		a = sc.nextFloat();
		Al_Canh.add(new Canh(a));
	}
	public float Cv()
	{
		return Al_Canh.get(1).getcanh()*2+Al_Canh.get(0).getcanh()*2;
	}
	public float Dt()
	{
		return Al_Canh.get(2).getcanh()*Al_Canh.get(0).getcanh();
	}

}
