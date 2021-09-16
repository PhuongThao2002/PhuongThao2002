package HinhHoc;

import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args)
	{
		int chon1, chon2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lua chon 1: Hinh chu nhat");
		System.out.println("Lua chon 2: Hinh vuong");
		System.out.println("Lua chon 3: Hinh tam giac");
		System.out.println("Lua chon 4: Hinh binh hanh");
		System.out.println("Lua chon cua ban la: ");
		chon2 = scan.nextInt();
		while (chon2<=0 || chon2>=5)
		{
			System.out.println("Ban da nhap sai, moi nhap lai: ");
			chon2 = scan.nextInt();
		}
		if (chon2==1)
			{
				Rectangle hcn = new Rectangle(2);
				//hcn.input();
			    System.out.println("Chu vi hinh chu nhat la: "+hcn.Cv());
			    System.out.println("Dien tich hinh chu nhat la: "+hcn.Dt());
			}
		else if (chon2==2)
			{
				Square hv = new Square(1);
				//hv.input();
			    System.out.println("Chu vi hinh vuong la: "+hv.Cv());
			    System.out.println("Dien tich hinh vuong la: "+hv.Dt());
			}
		else if (chon2==3)
			{
				Triangle htg = new Triangle(3) ;
  			    //htg.input();
			    System.out.println("Chu vi hinh tam giac la: "+htg.Cv());
			    System.out.println("Dien tich hinh tam giac la: "+htg.Dt());
			}
		else if (chon2==4)
			{
				Parallelogram hbh = new Parallelogram(2);
				//hbh.input();
			    System.out.println("Chu vi hinh binh hanh la: "+hbh.Cv());
			    System.out.println("Dien tich hinh binh hanh la: "+hbh.Dt());
			}
	}
}
