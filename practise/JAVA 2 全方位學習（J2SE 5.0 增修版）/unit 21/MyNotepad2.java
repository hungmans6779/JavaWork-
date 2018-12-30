import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class MyNotepad2 extends WindowAdapter implements ActionListener
{
 Frame f;
 Button b;
 TextArea ta;
 String fileName;	
 public static void main(String argv[])
 {
  new MyNotepad1(argv[0]);
 }	
 public MyNotepad2(String fileName)
 {
 	this.fileName=fileName;
 	f=new Frame(fileName);
 	//f.setResizable(false);
 	b=new Button("Àx¦sÀÉ®×");
 	b.addActionListener(this);
 	ta=new TextArea(10,40);
 	f.add(ta,BorderLayout.CENTER);
 	f.add(b,BorderLayout.SOUTH);
	f.addWindowListener(this);
 	f.pack();
 	f.setVisible(true);
 }	
 public void actionPerformed(ActionEvent e)
 {
 	try
 	{
 	 FileWriter fOut=new FileWriter(fileName,false);
	 fOut.write(ta.getText());
	 fOut.close();
 	}
 	catch(IOException ie)
 	{
 	 System.out.println(ie);	
 	}		
 }	
 public void windowClosing(WindowEvent e)
 {
 	System.exit(0);
 }	
}