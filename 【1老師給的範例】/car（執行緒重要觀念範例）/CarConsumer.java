//汽車消費者
public class CarConsumer
{
	CarStore cs;
	public CarConsumer(CarStore cs)//以汽車經銷商為參數建立物件
	{
		this.cs=cs;
	}
	public void buyCar()
	{
		int count=(int)(Math.random()*10+1);
		System.out.println(Thread.currentThread()+" 購買數量:" + count);
		cs.salesCar(count);
	}	
}