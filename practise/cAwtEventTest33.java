import java.awt.*;
import java.awt.event.*;
public class cAwtEventTest33 extends WindowAdapter implements ActionListener
{
 Frame frame;
 FileDialog fd;
 Checkbox cbLoad,cbSave;
 Label labelDir,labelFile;
 Button button;	
 public static void main(String argv[])
 {
  new cAwtEventTest33();
 }
 public cAwtEventTest33()
 {
  frame=new Frame("cAwtEventTest33");
  fd=new FileDialog(frame);
  frame.addWindowListener(this);	
  frame.setLocation(100,100);
  frame.setSize(300,300);
  Panel p1=new Panel(new GridLayout(1,2));
  CheckboxGroup cbg=new CheckboxGroup();
  cbLoad=new Checkbox("Load",cbg,true);
  cbSave=new Checkbox("Save",cbg,false);
  p1.add(cbLoad);
  p1.add(cbSave);
  Panel p2=new Panel(new GridLayout(2,1));
  labelDir=new Label("Directory = ");
  labelFile=new Label("File = ");
  p2.add(labelDir);
  p2.add(labelFile);
  button=new Button("Show FileDialog");
  button.addActionListener(this);
  frame.add(p1,BorderLayout.NORTH);
  frame.add(p2,BorderLayout.CENTER);
  frame.add(button,BorderLayout.SOUTH);
  frame.pack();
  frame.setVisible(true);
  
 }
 
 public void actionPerformed(ActionEvent ae)
 {
 	if(cbLoad.getState())
 	 fd.setMode(FileDialog.LOAD);
 	else
 	 fd.setMode(FileDialog.SAVE);
 	 
 	fd.show();
 	labelDir.setText("Directory = "+fd.getDirectory());
 	labelFile.setText("File = "+fd.getFile());
 	frame.pack();
 	
 }	
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);	
 }	
}