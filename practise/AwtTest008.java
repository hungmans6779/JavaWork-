import java.awt.*;
public class AwtTest008
{
 public static void main(String argv[])
 {
  Frame f=new Frame("GridBagLayout´ú¸Õ1");
  f.setLayout(new GridBagLayout());
  Button button[]=new Button[4];
  int attr[][]={{0,0,1,1,1,1},{1,0,1,1,0,0},{2,0,1,1,1,1},{0,1,3,1,0,0}};
  int anchor[]={GridBagConstraints.NORTHWEST,GridBagConstraints.CENTER,GridBagConstraints.NORTHEAST,GridBagConstraints.CENTER};
  int fill[]={GridBagConstraints.NONE,GridBagConstraints.BOTH,GridBagConstraints.NONE,GridBagConstraints.BOTH};
  for(int i=0;i<button.length;i++)
  {
   button[i]=new Button("Button"+(i+1));
   add(f,button[i],attr[i],anchor[i],fill[i]);	
  }	
  f.setSize(500,500);
  //f.pack();
  f.setVisible(true);
 }
 public static void add(Container con,Component com,int attr[],int anchor,int fill)
 {
  GridBagConstraints gbc=new GridBagConstraints();
  gbc.gridx=attr[0];
  gbc.gridy=attr[1];
  gbc.gridwidth=attr[2];
  gbc.gridheight=attr[3];	
  gbc.weightx=attr[4];
  gbc.weighty=attr[5];
  gbc.anchor=anchor;
  gbc.fill=fill;
 	con.add(com,gbc);
 }	
}