import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Ex21 extends WindowAdapter implements ActionListener
{
 Frame f;
 Button bSave,bLoad,bSaveOther;
 Button bExit;
 TextArea ta;
 String fileName;
 FileDialog fd;
 public static void main(String argv[])
 {
 	new Ex21();
 }		
 public Ex21()
 {
 	f=new Frame("Ex21 ----- 洪嘉宏於95年06月23日設計的程式");
 	f.addWindowListener(this);
 	ta=new TextArea(26,40);
 	f.add(ta,BorderLayout.NORTH);
 	Panel p1=new Panel(new GridLayout(1,3));
 	bLoad=new Button("開啟舊檔");
 	bLoad.addActionListener(this);
 	bLoad.setActionCommand("1");
 	bSave=new Button("儲存檔案");
 	bSave.setEnabled(false);
 	bSave.addActionListener(this);
 	bSave.setActionCommand("2");
 	bSaveOther=new Button("另存新檔");
 	bSaveOther.addActionListener(this);
 	bSaveOther.setActionCommand("3");
  p1.add(bLoad);
 	p1.add(bSave);
  p1.add(bSaveOther);
 	f.add(p1,BorderLayout.CENTER);
 	bExit=new Button("結束本程式");
 	bExit.setActionCommand("4");
 	bExit.addActionListener(this);
 	f.add(bExit,BorderLayout.SOUTH); 
 	f.setResizable(false);
 	f.setSize(500,500);
 	f.setVisible(true);	
 }
 public void actionPerformed(ActionEvent e)
 {
 	String title1="Ex21 現在使用的檔案（";
 	String title2="） ----- 洪嘉宏於95年06月23日設計的程式";
 	fd=new FileDialog(f);
 	Button bb=(Button)e.getSource();
 	//switch(Integer.parseInt(e.getActionCommand()))
 	switch(Integer.valueOf(e.getActionCommand()).intValue())
 	{
 	 //開啟舊檔 
 	 case 1:
 	  fd.setMode(FileDialog.LOAD);
 	  fd.setTitle("開啟舊檔 ----- 洪嘉宏的對話盒");
 	  fd.setVisible(true);
 	  fileName=fd.getFile();
 	  if(fileName!=null)
 	  {
 	   f.setTitle(title1+fileName+title2);
 	   bSave.setEnabled(true);	
 	   ta.setText("");
 	   try
 	   {
 	    FileReader fIn=new FileReader(fileName);  
      int i=fIn.read();
      String data="";
      while(i!=-1)
      {    
       ta.append(String.valueOf((char)i));
       i=fIn.read();	
      }	
      fIn.close();
     }
     catch(IOException ioe)
     {
      System.out.println(ioe);	
     }	 
    }	
 	  break; 		
 		
 	 //儲存檔案	
 	 case 2:
 	  try
 	  {
 	   FileWriter fOut=new FileWriter(fileName);
 	   fOut.write(ta.getText());
 	   fOut.close();
 	  }
 	  catch(IOException ioe)
 	  {
 	   ioe.printStackTrace();	
 	  }	 
 	 
 	  break;
 	  
 	  //另存新檔	
 	 case 3:
 	  fd.setMode(FileDialog.SAVE);
 	  fd.setTitle("另存新檔 ----- 洪嘉宏的對話盒");
 	  fd.setVisible(true);
 	  fileName=fd.getFile();
 	  f.setTitle(title1+fileName+title2);
 	  try
 	  {
     FileWriter fOut=new FileWriter(fileName);
     fOut.write(ta.getText());
     fOut.close();
    }
    catch(IOException ioe)
    {
     ioe.printStackTrace();	
    }	 
 	  break;  
 	 case 4:
 	  System.exit(0);
 	  break; 	
 	}		
 }
 
 public void windowClosing(WindowEvent e)
 {
 	System.exit(0);
 }		
}	