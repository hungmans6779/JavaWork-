//汽車經銷商
public class CarStore
{
	private int count;//安全庫存量
	private int order;//訂貨量
	public CarStore()
	{
		count=10;
	}
	synchronized public void addCar(int count)//進貨
	{
		CarProducer cp=new CarProducer(this);
		cp.salesCar(count);
		this.count+=count;
		System.out.println(Thread.currentThread().getName() + "進貨作業:目前存貨:" + count);
	}
	synchronized public void checkedCar(){
		if(order!=0){
			addCar(order);
			order=0;
			notifyAll();
		}
	}
	synchronized public void salesCar(int count)//銷貨
	{
		order+=count;
		while(count>this.count)//庫存量不足
		{
			try{
				wait();
			}catch(InterruptedException e){}
		}
		this.count-=count;
		System.out.println(Thread.currentThread().getName() + "銷貨作業:目前存貨:" + this.count);
	}
}