package Lesson3;

import java.util.ArrayList;

public class Mainprogram
{
	public static void main(String[] args)
	{
		ArrayList<Hang> Al_Hang = new ArrayList <Hang>();
		Al_Hang.add (new Hang("Dell"));
		Al_Hang.add(new Hang("Asus"));
        Al_Hang.add(new Hang("MSI"));
        
        ArrayList<CPU> Al_Cpu = new ArrayList <CPU>();
        Al_Cpu.add(new CPU("Ryzen 3 3500", Al_Hang.get(1)));
        Al_Cpu.add(new CPU("Ryzen 4 3500", Al_Hang .get(1)));
        Al_Cpu.add(new CPU("Intel core i 5 11500", Al_Hang.get(2)));
        
        ArrayList<Ram> Al_Ram = new ArrayList<Ram>();
        Al_Ram.add(new Ram("2600 Ghz 8GB", Al_Hang.get(0)));
        Al_Ram.add(new Ram("2700 Ghz 12GB", Al_Hang.get(1)));
        Al_Ram.add(new Ram("3200 Ghz 16GB", Al_Hang.get(1)));

        ArrayList<Mainbroad> Al_Main = new ArrayList<Mainbroad>();
        Al_Main.add(new Mainbroad("X881", Al_Hang.get(2)));
        Al_Main.add(new Mainbroad("Z772", Al_Hang.get(1)));
        Al_Main.add(new Mainbroad("B450M", Al_Hang.get(1)));

        ArrayList<Laptop> Al_lapTop = new ArrayList<Laptop>();
        Al_lapTop.add(new Laptop(Al_Cpu.get(0), Al_Ram.get(1), Al_Main.get(2), Al_Hang.get(0), 5));

        System.out.printf("%s %s %s %d", Al_lapTop.get(0).getCpu().getName(), Al_lapTop.get(0).getRam().getName(),
                Al_lapTop.get(0).getMainbroad().getName(), Al_lapTop.get(0).getSoLuong());
	}
}
