package HinhHoc;

public class Rectangle extends Input
{
	public Rectangle(int n)
	{
		super(n);
	}
	public float Cv()
	{
		return Al_Canh.get(1).getcanh()*2+Al_Canh.get(0).getcanh()*2;
	}
	public float Dt()
	{
		return Al_Canh.get(1).getcanh()*Al_Canh.get(0).getcanh();
	}
}
