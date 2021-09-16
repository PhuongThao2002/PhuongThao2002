package HinhHoc;

public class Square extends Input
{
	public Square(int n)
	{
		super(n);
	}
	public float Cv()
	{
		return Al_Canh.get(0).getcanh()*4;
	}
	public float Dt()
	{
		return Al_Canh.get(0).getcanh()*Al_Canh.get(0).getcanh();
	}
}
