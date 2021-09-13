package BTVN_3;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		int i,j,k;
		int l;
		ArrayList<Hang> Al_Hang = new ArrayList <Hang>();
		Al_Hang.add(new Hang("DELL"));
		Al_Hang.add(new Hang("HP"));
		Al_Hang.add(new Hang("MSI"));
		
		ArrayList<CPU> Al_Cpu = new ArrayList <CPU>();
        Al_Cpu.add(new CPU("Ryzen 3 3500", Al_Hang.get(1),1));
        Al_Cpu.add(new CPU("Ryzen 4 3500", Al_Hang.get(1),1));
        Al_Cpu.add(new CPU("Intel core i 5 11500", Al_Hang.get(2),2));
        
        ArrayList<Ram> Al_Ram = new ArrayList<Ram>();
        Al_Ram.add(new Ram("2600 Ghz 8GB", Al_Hang.get(0),2));
        Al_Ram.add(new Ram("2700 Ghz 12GB", Al_Hang.get(1),1));
        Al_Ram.add(new Ram("3200 Ghz 16GB", Al_Hang.get(1),1));

        ArrayList<Mainbroad> Al_Main = new ArrayList<Mainbroad>();
        Al_Main.add(new Mainbroad("X881", Al_Hang.get(2),0));
        Al_Main.add(new Mainbroad("Z772", Al_Hang.get(1),2));
        Al_Main.add(new Mainbroad("B450M", Al_Hang.get(1),1));

        ArrayList<Laptop> Al_lapTop = new ArrayList<Laptop>();

        j=0;i=0;k=0;l=0;
        while (i<3)
        {
        	j=0;
        	while (j<3)
        	{
        		k=0;
        		while (k<3)
        		{

        			if (Al_Cpu.get(i).getMatchID() == Al_Ram.get(j).getMatchID() && Al_Ram.get(j).getMatchID() == Al_Main.get(k).getMatchID())
        			{
        				 Al_lapTop.add(new Laptop(Al_Cpu.get(i), Al_Ram.get(j), Al_Main.get(k), Al_Hang.get(0), 5));
        				 System.out.printf("%s %s %s %s %d\n", Al_lapTop.get(l).getCpu().getName(), Al_lapTop.get(l).getRam().getName(),
        		                Al_lapTop.get(l).getMainbroad().getName(),Al_lapTop.get(l).getHang().getName(), Al_lapTop.get(l).getSoLuong());
        				 l=l+1;
        		    }
        			k=k+1;
        	    }
        		j=j+1;
            }
        	i=i+1;
	     }
	}
}
