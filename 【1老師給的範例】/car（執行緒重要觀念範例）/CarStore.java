//�T���g�P��
public class CarStore
{
	private int count;//�w���w�s�q
	private int order;//�q�f�q
	public CarStore()
	{
		count=10;
	}
	synchronized public void addCar(int count)//�i�f
	{
		CarProducer cp=new CarProducer(this);
		cp.salesCar(count);
		this.count+=count;
		System.out.println(Thread.currentThread().getName() + "�i�f�@�~:�ثe�s�f:" + count);
	}
	synchronized public void checkedCar(){
		if(order!=0){
			addCar(order);
			order=0;
			notifyAll();
		}
	}
	synchronized public void salesCar(int count)//�P�f
	{
		order+=count;
		while(count>this.count)//�w�s�q����
		{
			try{
				wait();
			}catch(InterruptedException e){}
		}
		this.count-=count;
		System.out.println(Thread.currentThread().getName() + "�P�f�@�~:�ثe�s�f:" + this.count);
	}
}