//汽車製造商
public class CarProducer
{
	CarStore cs;
	public CarProducer(CarStore cs)//以汽車經銷商為參數建立物件
	{
		this.cs=cs;
	}
	synchronized public void salesCar(int count)
	{
		for(int a=0;a<1000000000;a++);
	}	
}