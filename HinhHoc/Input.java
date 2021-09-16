package HinhHoc;

import java.util.Scanner;
import java.util.ArrayList;

public class Input 
{
	Scanner sc = new Scanner(System.in);
	ArrayList<Canh> Al_Canh = new ArrayList <Canh>();
	public Input(int n) 
	{
		float c;
		for(int i=1; i<=n; i++) 
	    {
			System.out.println("Do dai canh thu " + i + " la: ");
			c=sc.nextFloat();
			Al_Canh.add(new Canh(c));
	    }
	}

}
