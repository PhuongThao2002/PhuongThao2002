package School;

public class Nhanvienvs extends Nhansu  
{
	String vitri;
	public Nhanvienvs(String ten, int tuoi, String cccd, String vitri )
	{
		super(ten,tuoi,cccd);
		this.vitri=vitri;
	}
	public String getvitri()
	   {
		   return vitri;
	   }
}
