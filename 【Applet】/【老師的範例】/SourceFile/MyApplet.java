import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet{
	boolean runThread=false;
	int x=0;
	boolean left=false;
	Thread t;
	private void changeX(){
		if(left){
			x--;
			if(x<=0){
				left=false;
			}
			
		}else{
			x++;
			if(x>=730){
				left=true;
			}
		}
	}
	public void init(){
		setBackground(Color.GREEN);
		setForeground(Color.RED);
	}
	public void start(){
		runThread=true;
		t=new Thread(){
			public void run(){
				try{
					while(runThread){
						sleep(100);
						changeX();
						repaint();
					}
				}catch(InterruptedException e){}
			}
		};
		t.start();
	}
	public void paint(Graphics g){
		g.setFont(new Font(null,5,50));
		
		g.drawString("�w",20,45);
		g.drawString("��",120,45);
		g.drawString("��",220,45);
		g.drawString("�{",320,45);
		g.drawString("�j",420,45);
		g.drawString("��",520,45);
		g.drawString("�@",620,45);
		g.drawString("��",720,45);

		g.setFont(new Font(null,5,30));
		g.setColor(Color.YELLOW);
		g.drawString("Yung",x,40);
	}
	public void stop(){
		runThread=false;
		t=null;
	}
}