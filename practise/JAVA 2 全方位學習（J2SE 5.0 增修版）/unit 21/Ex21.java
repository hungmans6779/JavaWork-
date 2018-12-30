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
 	f=new Frame("Ex21 ----- �x�ŧ���95�~06��23��]�p���{��");
 	f.addWindowListener(this);
 	ta=new TextArea(26,40);
 	f.add(ta,BorderLayout.NORTH);
 	Panel p1=new Panel(new GridLayout(1,3));
 	bLoad=new Button("�}������");
 	bLoad.addActionListener(this);
 	bLoad.setActionCommand("1");
 	bSave=new Button("�x�s�ɮ�");
 	bSave.setEnabled(false);
 	bSave.addActionListener(this);
 	bSave.setActionCommand("2");
 	bSaveOther=new Button("�t�s�s��");
 	bSaveOther.addActionListener(this);
 	bSaveOther.setActionCommand("3");
  p1.add(bLoad);
 	p1.add(bSave);
  p1.add(bSaveOther);
 	f.add(p1,BorderLayout.CENTER);
 	bExit=new Button("�������{��");
 	bExit.setActionCommand("4");
 	bExit.addActionListener(this);
 	f.add(bExit,BorderLayout.SOUTH); 
 	f.setResizable(false);
 	f.setSize(500,500);
 	f.setVisible(true);	
 }
 public void actionPerformed(ActionEvent e)
 {
 	String title1="Ex21 �{�b�ϥΪ��ɮס]";
 	String title2="�^ ----- �x�ŧ���95�~06��23��]�p���{��";
 	fd=new FileDialog(f);
 	Button bb=(Button)e.getSource();
 	//switch(Integer.parseInt(e.getActionCommand()))
 	switch(Integer.valueOf(e.getActionCommand()).intValue())
 	{
 	 //�}������ 
 	 case 1:
 	  fd.setMode(FileDialog.LOAD);
 	  fd.setTitle("�}������ ----- �x�ŧ�����ܲ�");
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
 		
 	 //�x�s�ɮ�	
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
 	  
 	  //�t�s�s��	
 	 case 3:
 	  fd.setMode(FileDialog.SAVE);
 	  fd.setTitle("�t�s�s�� ----- �x�ŧ�����ܲ�");
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