//�T�����O��
public class CarConsumer
{
	CarStore cs;
	public CarConsumer(CarStore cs)//�H�T���g�P�Ӭ��Ѽƫإߪ���
	{
		this.cs=cs;
	}
	public void buyCar()
	{
		int count=(int)(Math.random()*10+1);
		System.out.println(Thread.currentThread()+" �ʶR�ƶq:" + count);
		cs.salesCar(count);
	}	
}