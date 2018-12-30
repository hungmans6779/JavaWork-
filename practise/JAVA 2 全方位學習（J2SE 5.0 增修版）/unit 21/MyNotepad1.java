import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class MyNotepad1 extends WindowAdapter implements ActionListener
{
 Frame f;
 Button b;
 TextArea ta;
 String fileName;	
 public static void main(String argv[])
 {
  new MyNotepad1(argv[0]);
 }	
 public MyNotepad1(String fileName)
 {
 	this.fileName=fileName;
 	f=new Frame(fileName);
  f.addWindowListener(this);
 	f.setResizable(false);
 	b=new Button("Àx¦sÀÉ®×");
 	b.addActionListener(this);
 	ta=new TextArea(10,40);
 	f.add(ta,BorderLayout.CENTER);
 	f.add(b,BorderLayout.SOUTH);
 	f.pack();
 	f.setVisible(true);
 }	
 public void windowClosing(WindowEvent we)
 {
 	System.exit(0);
 }	

 public void actionPerformed(ActionEvent ae)
 {
 	byte bytes[]=new byte[64];
 	try
 	{
 	 FileOutputStream fOut=new FileOutputStream(fileName,false);
	 bytes=ta.getText().getBytes();
	 fOut.write(bytes);
	 fOut.close();
 	}
 	catch(IOException e)
 	{
 	 System.out.println(e);	
 	}		
 }	
}