import java.awt.*;
public class GridBagLayoutStep1
{
 public static void main(String argv[])
 {
  Frame f=new Frame("GridBagLayoutStep1");
  int att[][]={{0,0,1,1},{1,0,1,1},{2,0,1,1},{0,1,3,1}};
  Button b[]=new Button[4];
  f.setLayout(new GridBagLayout());
  for(int i=0;i<b.length;i++)
  {
   b[i]=new Button("Button"+Integer.toString(i+1));
   add(f,b[i],att[i]);
  }
  f.pack();
  f.setVisible(true);
 }
 private static void add(Container con,Component com,int att[])
 {
  GridBagConstraints gbc=new GridBagConstraints();
  gbc.gridx=att[0];
  gbc.gridy=att[1];
  gbc.gridwidth=att[2];
  gbc.gridheight=att[3];
  con.add(com,gbc);
 }
}