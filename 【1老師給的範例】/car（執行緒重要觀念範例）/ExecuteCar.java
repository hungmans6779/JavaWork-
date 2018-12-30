public class ExecuteCar
{
	static int liveThread=5;
	public static void main(String[] args)
	{
		final CarStore cs=new CarStore();
		Thread d=new Thread(){
			public void run(){
				while(true){
					try{
						sleep(1000);
						cs.checkedCar();
						if(liveThread==0)
							break;
					}catch(InterruptedException e){}
				}
			}
		};
		d.start();
		Thread t=new Thread(){
			public void run(){
				CarConsumer cc=new CarConsumer(cs);
				cc.buyCar();
				liveThread--;
			}
		};
		Thread t2=new Thread(){
			public void run(){
				CarConsumer cc=new CarConsumer(cs);
				cc.buyCar();
				liveThread--;
			}
		};
		Thread t3=new Thread(){
			public void run(){
				CarConsumer cc=new CarConsumer(cs);
				cc.buyCar();
				liveThread--;
			}
		};
		Thread t4=new Thread(){
			public void run(){
				CarConsumer cc=new CarConsumer(cs);
				cc.buyCar();
				liveThread--;
			}
		};
		Thread t5=new Thread(){
			public void run(){
				CarConsumer cc=new CarConsumer(cs);
				cc.buyCar();
				liveThread--;
			}
		};
		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}