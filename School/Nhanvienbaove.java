package School;

public class Nhanvienbaove extends Nhansu  {
    String vitri;
	public Nhanvienbaove(String ten, int tuoi, String cccd, String vitri )
	{
		super(ten,tuoi,cccd);
		this.vitri=vitri;
	}
	public String getvitri()
	   {
		   return vitri;
	   }
}
