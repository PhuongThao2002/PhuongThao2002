package HinhHoc;

public class Triangle extends Input
{
	public Triangle(int n)
	{
		super(n);
	}
	public float Cv()
	{
		return Al_Canh.get(1).getcanh()+Al_Canh.get(2).getcanh()+Al_Canh.get(0).getcanh();
	}
	public float Dt()
	{
		float a=Al_Canh.get(1).getcanh();
		float b=Al_Canh.get(2).getcanh();
		float c=Al_Canh.get(0).getcanh();
		float p=(a+b+c)/2;
		return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
