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
  setTitle("�ۥѤH������");
  setLocation(500,200);
  Panel p=new Panel(new FlowLayout(FlowLayout.LEFT));
  tfName=new TextField(10);
  p.add(new Label("�b���G"));
  p.add(tfName);
  add(p,BorderLayout.NORTH);
  
  p=new Panel(new FlowLayout(FlowLayout.LEFT));
  tfPassword=new TextField(10);
  tfPassword.setEchoChar('*');
  p.add(new Label("�K�X�G"));
  p.add(tfPassword);
  add(p,BorderLayout.CENTER);
  
  p=new Panel();
  bOk=new Button("�T�w");
  bOk.setActionCommand("1");
  bOk.addActionListener(new MyListenerHandler());
  bCancel=new Button("����");
  bCancel.setActionCommand("2");
  bCancel.addActionListener(new MyListenerHandler());
  bExit=new Button("�����{��");
  bExit.setActionCommand("3");
  bExit.addActionListener(new MyListenerHandler());
  p.add(bOk);
  p.add(bCancel);
  p.add(bExit);
  add(p,BorderLayout.SOUTH);  
  setResizable(false);
  pack();
 }
 //�������O
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
   //�Ĥ@�ؼg�k	
   /*
   int select=Integer.parseInt(((Button)ae.getSource()).getActionCommand());
   switch(select)
   {
   	case 1: System.out.println("�T�w"); break;
   	case 2: System.out.println("����"); break;
   	case 3: System.out.println("�����{��"); System.exit(0); break;
   	default: System.out.println("�������A"); break;
   }
   */
   
   //�ĤG�ؼg�k�]�Ѯv�Ъ��^
   if(ae.getSource()==bOk)
    System.out.println("�T�w");
   else if(ae.getSource()==bCancel)
    System.out.println("����");
   else 
    dispose();
   	
   	
  } 
 }			
}

public class cAwtEventTest35
{
 public static void main(String argv[])
 {
  MyFrame myFrame=new MyFrame("�ۥѤH������");
  myFrame.show();
 }
}
