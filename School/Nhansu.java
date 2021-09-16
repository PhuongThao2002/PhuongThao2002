package School;

public class Nhansu 
{
    private String ten;
    private int tuoi;
    private String cccd;
    Nhansu(String ten, int tuoi, String cccd)
	{
		this.ten = ten;
		this.tuoi = tuoi;
		this.cccd = cccd;
	}
	public String getten() {
        return ten;
    }
	public int gettuoi() {
        return tuoi;
    }
	public String getcccd() {
        return cccd;
    }
}
