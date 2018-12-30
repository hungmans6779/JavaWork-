public class cStationTicketTest1{
	public static void main(String[] args){
		final StationSystem ss=new StationSystem();
    Thread a1=new Thread()
    {
     public void run()
     {
     	while(true)
     	{
       try
       {
        sleep(5000);	
        if(ss.getTicket()>0) Thread.currentThread().wait();
        if(ss.getTicket()<=0)
            ss.addTicket();
       }
       catch(InterruptedException ie){}			

      } 
     }	
    };	
		Thread d1=new Thread("HUNG CHIA HUNG"){
			public void run(){
				System.out.println("ヘ玡布计" + ss.getTicket());
				boolean b=ss.buyTicket();
				System.out.println(getName() + ":" + (b?"潦布Θ":"潦布ア毖"));
			}
		};
		Thread d2=new Thread("パ"){
			public void run(){
				System.out.println("ヘ玡布计" + ss.getTicket());
				boolean b=ss.buyTicket();
				System.out.println(getName() + ":" + (b?"潦布Θ":"潦布ア毖"));
			}
		};
		Thread d3=new Thread("縒︽獿"){
			public void run(){
				System.out.println("ヘ玡布计" + ss.getTicket());
				boolean b=ss.buyTicket();
				System.out.println(getName() + ":" + (b?"潦布Θ":"潦布ア毖"));
			}
		};
		Thread d4=new Thread("纀"){
			public void run(){
				System.out.println("ヘ玡布计" + ss.getTicket());
				boolean b=ss.buyTicket();
				System.out.println(getName() + ":" + (b?"潦布Θ":"潦布ア毖"));
			}
		};
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		a1.start();
	}
	
}


class StationSystem
{
	private int ticket;
	public StationSystem()
	{
		ticket=3;
	}
	public int getTicket()
	{
		return ticket;
	}
	public synchronized boolean  buyTicket()
	{
		while(ticket<=0)
		{
		 try
		 {
		 	wait();
		 }		
		 catch(InterruptedException ie){}
		}	
		if(ticket>0){
			for(int i=0;i<1000000;i++);
			ticket--;
			return true;
		}
		return false;
	}
	public synchronized void addTicket()
	{
	 ticket+=5;
	 notify();
	}	
}