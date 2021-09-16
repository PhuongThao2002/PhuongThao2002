package School;

public class Giaovien extends Nhansu 
{
   private String daymon;
   public Giaovien(String ten,int tuoi, String cccd, String daymon)
   {
	   super(ten,tuoi,cccd);
	   this.daymon=daymon;
   }
   public String getdaymon()
   {
	   return daymon;
   }
}
