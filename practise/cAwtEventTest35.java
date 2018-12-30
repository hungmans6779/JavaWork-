import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
 TextField tfName,tfPassword;
 Button bOk,bCancel,bExit;	
 public MyFrame(String title)
 {
 	this();
 	setTitle(title);
 }		
 public MyFrame()
 {  
  addWindowListener(new MyListenerHandler());
  setTitle("自由人的視窗");
  setLocation(500,200);
  Panel p=new Panel(new FlowLayout(FlowLayout.LEFT));
  tfName=new TextField(10);
  p.add(new Label("帳號："));
  p.add(tfName);
  add(p,BorderLayout.NORTH);
  
  p=new Panel(new FlowLayout(FlowLayout.LEFT));
  tfPassword=new TextField(10);
  tfPassword.setEchoChar('*');
  p.add(new Label("密碼："));
  p.add(tfPassword);
  add(p,BorderLayout.CENTER);
  
  p=new Panel();
  bOk=new Button("確定");
  bOk.setActionCommand("1");
  bOk.addActionListener(new MyListenerHandler());
  bCancel=new Button("取消");
  bCancel.setActionCommand("2");
  bCancel.addActionListener(new MyListenerHandler());
  bExit=new Button("結束程式");
  bExit.setActionCommand("3");
  bExit.addActionListener(new MyListenerHandler());
  p.add(bOk);
  p.add(bCancel);
  p.add(bExit);
  add(p,BorderLayout.SOUTH);  
  setResizable(false);
  pack();
 }
 //內部類別
 class MyListenerHandler implements WindowListener,ActionListener
 {
  public void windowClosing(WindowEvent we)
  {
   //Frame f=(Frame)we.getSource();
   //f.dispose();	
   dispose();
  }	
  public void windowClosed(WindowEvent we){}
  public void windowOpened(WindowEvent we){}
  public void windowActivated(WindowEvent we){}
  public void windowDeactivated(WindowEvent we){}
  public void windowIconified(WindowEvent we){}
  public void windowDeiconified(WindowEvent we){}
  public void actionPerformed(ActionEvent ae)
  {
   //第一種寫法	
   /*
   int select=Integer.parseInt(((Button)ae.getSource()).getActionCommand());
   switch(select)
   {
   	case 1: System.out.println("確定"); break;
   	case 2: System.out.println("取消"); break;
   	case 3: System.out.println("結束程式"); System.exit(0); break;
   	default: System.out.println("未知狀態"); break;
   }
   */
   
   //第二種寫法（老師教的）
   if(ae.getSource()==bOk)
    System.out.println("確定");
   else if(ae.getSource()==bCancel)
    System.out.println("取消");
   else 
    dispose();
   	
   	
  } 
 }			
}

public class cAwtEventTest35
{
 public static void main(String argv[])
 {
  MyFrame myFrame=new MyFrame("自由人的視窗");
  myFrame.show();
 }
}
