//�T���s�y��
public class CarProducer
{
	CarStore cs;
	public CarProducer(CarStore cs)//�H�T���g�P�Ӭ��Ѽƫإߪ���
	{
		this.cs=cs;
	}
	synchronized public void salesCar(int count)
	{
		for(int a=0;a<1000000000;a++);
	}	
}