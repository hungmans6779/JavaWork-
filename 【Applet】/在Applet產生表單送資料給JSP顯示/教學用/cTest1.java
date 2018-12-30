import java.awt.*;
public class cTest1
{
 public static void main(String argv[])
 {
  Frame frame=new Frame("test");
  frame.setLocation(100,100);
  frame.setSize(200,200);
  
  
  Button [] button=new Button[6];
  
  
  button[0]=new Button("1");
  button[1]=new Button("2");
  button[2]=new Button("3");
  frame.add(button[0],BorderLayout.NORTH);
    frame.add(button[1],BorderLayout.CENTER);
      frame.add(button[2],BorderLayout.SOUTH);
  frame.show();
  
 }
}