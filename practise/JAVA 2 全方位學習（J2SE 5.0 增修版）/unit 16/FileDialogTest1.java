import java.awt.*;
import java.awt.event.*;
public class FileDialogTest1 implements ActionListener
{
 Frame f;
 FileDialog fd;
 CheckboxGroup cbg;
 Checkbox cbLoad,cbSave;
 Label lDirectory,lFile;
 Button b;
 public static void main(String argv[])
 {
 	new FileDialogTest1();
 }		
 public FileDialogTest1()
 {
 	f=new Frame("FileDialogTest1");
 	
 	Panel p1=new Panel(new GridLayout(1,2));
 	cbg=new CheckboxGroup();
 	cbLoad=new Checkbox("LOAD",cbg,true);
 	cbSave=new Checkbox("SAVE",cbg,false);
 	p1.add(cbLoad);
 	p1.add(cbSave);
 	
 	Panel p2=new Panel(new GridLayout(2,1));
 	lDirectory=new Label("Directory");
 	lFile=new Label("File");
 	p2.add(lDirectory);
 	p2.add(lFile);
 	
 	b=new Button("顯示");
 	b.addActionListener(this);
 	
 	fd=new FileDialog(f);
 	
 	f.add(p1,BorderLayout.NORTH);
 	f.add(p2,BorderLayout.CENTER);
 	f.add(b,BorderLayout.SOUTH);
 	f.pack();
 	f.setVisible(true);	
 }	
 
 public void actionPerformed(ActionEvent e)
 {
 	if(cbLoad.getState())
 	{
 	 fd.setMode(FileDialog.LOAD);	
 	 fd.setTitle("開啟");
 	}	
 	else
 	{
 	 fd.setMode(FileDialog.SAVE);	
 	 fd.setTitle("儲存");
 	}	
 	fd.setVisible(true);
 	lDirectory.setText("Directory : "+fd.getDirectory());
 	lFile.setText("File : "+fd.getFile());
 }	
 
}	
