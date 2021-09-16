package BTVN;

import java.util.Scanner;

public class main 
{
	public static void main(String[] args)
	{
		int chon1, chon2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lua chon 1: Tinh chu vi, dien tich");
		System.out.println("Lua chon 1: Tinh diem trung binh");
		System.out.println("Lua chon cua ban la: ");
		chon1 = scan.nextInt();
		if (chon1==1)
		{
			System.out.println("Lua chon 1: Hinh chu nhat");
			System.out.println("Lua chon 2: Hinh vuong");
			System.out.println("Lua chon 3: Hinh thoi");
			System.out.println("Lua chon 4: Hinh tam giac");
			System.out.println("Lua chon 5: Hinh binh hanh");
			System.out.println("Lua chon cua ban la: ");
			chon2 = scan.nextInt();
			if (chon2==1)
			{
				Rectangular hcn = new Rectangular();
				hcn.input();
			    System.out.println("Chu vi hinh chu nhat la: "+hcn.Cv());
			    System.out.println("Dien tich hinh chu nhat la: "+hcn.Dt());
			}
			if (chon2==2)
			{
				Square hv = new Square();
				hv.input();
			    System.out.println("Chu vi hinh vuong la: "+hv.Cv());
			    System.out.println("Dien tich hinh vuong la: "+hv.Dt());
			}
			if (chon2==3)
			{
				Rhombus ht = new Rhombus();
				ht.input();
			    System.out.println("Chu vi hinh thoi la: "+ht.Cv());
			    System.out.println("Dien tich hinh thoi la: "+ht.Dt());
			}
			if (chon2==4)
			{
				Triangle htg = new Triangle() ;
  			    htg.input();
			    System.out.println("Chu vi hinh tam giac la: "+htg.Cv());
			    System.out.println("Dien tich hinh tam giac la: "+htg.Dt());
			}
			if (chon2==5)
			{
				Parallelogram hbh = new Parallelogram();
				hbh.input();
			    System.out.println("Chu vi hinh binh hanh la: "+hbh.Cv());
			    System.out.println("Dien tich hinh binh hanh la: "+hbh.Dt());
			}
		}
		else 
		{
			Student s = new Student();
			s.input();
			System.out.println("Diem trung binh la: "+s.diemtb());
		}
	}
}
