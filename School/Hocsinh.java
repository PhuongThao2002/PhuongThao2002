package School;

public class Hocsinh extends Nhansu 
{
	String lop;
	public Hocsinh(String ten, int tuoi, String cccd, String lop )
	{
		super(ten,tuoi,cccd);
		this.lop=lop;
	}
	public String getlop()
	   {
		   return lop;
	   }
 
}
