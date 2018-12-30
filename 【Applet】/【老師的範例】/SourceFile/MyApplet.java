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
		
		g.drawString("歡",20,45);
		g.drawString("迎",120,45);
		g.drawString("光",220,45);
		g.drawString("臨",320,45);
		g.drawString("大",420,45);
		g.drawString("笨",520,45);
		g.drawString("世",620,45);
		g.drawString("界",720,45);

		g.setFont(new Font(null,5,30));
		g.setColor(Color.YELLOW);
		g.drawString("Yung",x,40);
	}
	public void stop(){
		runThread=false;
		t=null;
	}
}