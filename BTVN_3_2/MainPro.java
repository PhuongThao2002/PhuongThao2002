package BTVN_3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPro 
{
	public static void main(String[] args)
	{
		int i;
		String tensach, tentg;
		ArrayList<Tacgia> Al_Tg = new ArrayList <Tacgia>();
		Al_Tg.add(new Tacgia("Adam Khoo",1977,10));
		Al_Tg.add(new Tacgia("Dale Carnegie",1980,2));
		Al_Tg.add(new Tacgia("Dostoevsky",1997,3));
		
		ArrayList<Trangthai> Al_tt = new ArrayList <Trangthai>();
		Al_tt.add(new Trangthai("Trong kho"));
		Al_tt.add(new Trangthai("Trung bay"));
		Al_tt.add(new Trangthai("Da cho muon"));
		
		ArrayList<Sach> Al_sach = new ArrayList <Sach>();
		Al_sach.add(new Sach(Al_Tg.get(1),Al_tt.get(0),"Dac nhan tam",3));
		Al_sach.add(new Sach(Al_Tg.get(1),Al_tt.get(1),"Dac nhan tam",2));
		Al_sach.add(new Sach(Al_Tg.get(1),Al_tt.get(2),"Dac nhan tam",4));
		Al_sach.add(new Sach(Al_Tg.get(0),Al_tt.get(0),"Toi tai gioi ban cung the",5));
		Al_sach.add(new Sach(Al_Tg.get(0),Al_tt.get(1),"Toi tai gioi ban cung the",2));
		Al_sach.add(new Sach(Al_Tg.get(0),Al_tt.get(2),"Toi tai gioi ban cung the",1));
		Al_sach.add(new Sach(Al_Tg.get(2),Al_tt.get(0),"Toi ac va trung phat",4));
		Al_sach.add(new Sach(Al_Tg.get(2),Al_tt.get(0),"Toi ac va trung phat",9));
		Al_sach.add(new Sach(Al_Tg.get(2),Al_tt.get(0),"Toi ac va trung phat",7));
		Al_sach.add(new Sach(Al_Tg.get(1),Al_tt.get(0),"Toi ac va trung phat",3));
		Al_sach.add(new Sach(Al_Tg.get(2),Al_tt.get(0),"Toi tai gioi ban cung the",5));
		Al_sach.add(new Sach(Al_Tg.get(1),Al_tt.get(0),"Toi tai gioi ban cung the",5));
		Al_sach.add(new Sach(Al_Tg.get(1),Al_tt.get(0),"Dac nhan tam",3));
		Al_sach.add(new Sach(Al_Tg.get(0),Al_tt.get(0),"Dac nhan tam",3));
		i=0;
		System.out.println("Ten sach: ");
		Scanner input= new Scanner(System.in);
		tensach= input.nextLine();
		System.out.println("Ten tac gia: ");
		tentg= input.nextLine();
		while (i<14)
		{
			if (tensach.equals(Al_sach.get(i).getname()) && tentg.equals(Al_sach.get(i).gettacgia().getName())) 
			{
				System.out.printf("%s %s %s %d\n", Al_sach.get(i).gettacgia().getName(),Al_sach.get(i).gettrangthai().gettt(),
						Al_sach.get(i).getname(), Al_sach.get(i).getsoluong());
			}
			i=i+1;
		}
		
	}	
}
