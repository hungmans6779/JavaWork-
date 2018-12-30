import java.awt.*;
class DrawRectTest1
{
 public static void main(String argv[])
 {
 	Frame f=new Frame("DrawRectTest1");
 	MyCanvasRect mycanvas=new MyCanvasRect();
 	f.add(mycanvas,BorderLayout.CENTER);
 	f.pack();
 	f.setVisible(true);
 }	

}

 class MyCanvasRect extends Canvas
 {
  public MyCanvasRect()
  {
   setSize(450,300);
   setBackground(Color.blue);
  }		
 	public void paint(Graphics g)
 	{
 	 g.setColor(Color.green);	
 	 g.drawString("drawRect",15,30);
 	 g.drawRect(10,50,60,70);	
 	 
 	 g.setColor(Color.red);
 	 g.drawString("drawRoundRect",85,30);
 	 g.drawRoundRect(80,50,100,70,10,10);
 	 
 	 g.setColor(Color.cyan);
 	 g.drawString("draw3DRect(true)",205,30);
 	 g.draw3DRect(200,50,100,70,true);
 	 
 	 g.drawString("draw3DRect(false)",325,30);
 	 g.draw3DRect(320,50,100,70,false);		
 	 
 	 g.setColor(Color.green);
 	 g.drawString("fillRect",15,170);
 	 g.fillRect(10,190,60,70);
 	 
 	 g.setColor(Color.red);
 	 g.drawString("fillRoundRect",85,170);
 	 g.fillRoundRect(80,190,100,70,10,10);
 	 
 	 g.setColor(Color.cyan);
 	 g.drawString("fill3DRect(true)",205,170);
 	 g.fill3DRect(200,190,100,70,true);
 	 
 	 g.drawString("fill3DRect(false)",325,170);
 	 g.fill3DRect(320,190,100,70,false);	 
 	}	
 }