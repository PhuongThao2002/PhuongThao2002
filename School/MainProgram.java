package School;

import java.util.ArrayList;

public class MainProgram {
	public static void main(String[] args)
	{
		int i=0;
		ArrayList<Giaovien> Al_Gv = new ArrayList <Giaovien>();
		Al_Gv.add(new Giaovien("Nguyen Van An",30,"0289374489","Toan"));
		Al_Gv.add(new Giaovien("Nguyen Thi Phuong Thao",35,"478927534","Ly"));
		Al_Gv.add(new Giaovien("Bui Van Thuan",40,"561896234","Hoa"));
		
		ArrayList<Nhanvienbaove> Al_Bv = new ArrayList <Nhanvienbaove>();
		Al_Bv.add(new Nhanvienbaove("Nguyen Van Binh",30,"0289374489","Nha A"));
		Al_Bv.add(new Nhanvienbaove("Tran Van Huy",50,"387497930","Nha B"));
		Al_Bv.add(new Nhanvienbaove("Pham Van Dong",40,"461615750","Nha C"));
		
		ArrayList<Nhanvienvs> Al_Vs = new ArrayList <Nhanvienvs>();
		Al_Vs.add(new Nhanvienvs("Nguyen Van Binh",35,"0289374489","Nha A"));
		Al_Bv.add(new Nhanvienbaove("Tran Van Huy",42,"0558547855","Nha B"));
		Al_Bv.add(new Nhanvienbaove("Pham Van Dong",47,"0188855477","Nha C"));
		
		ArrayList<Hocsinh> Al_Hs = new ArrayList <Hocsinh>();
		Al_Hs.add(new Hocsinh("Le Thi Trang",17,"08418785118","Lop 11A"));
		Al_Hs.add(new Hocsinh("Pham Van Anh",18,"08418785118","Lop 12A"));
		Al_Hs.add(new Hocsinh("Nguyen Thi Tuyet",16,"08418785118","Lop 10A"));
	    
		while (i<Al_Hs.size())
		{
			System.out.printf("%s %d %s %s\n", Al_Hs.get(i).getten(), Al_Hs.get(i).gettuoi(),
					 Al_Hs.get(i).getcccd(), Al_Hs.get(i).getlop());
			i++;
		}
		
	}
}
