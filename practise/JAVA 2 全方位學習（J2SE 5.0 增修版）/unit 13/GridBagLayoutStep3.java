import java.awt.*;
public class GridBagLayoutStep3
{
 public static void main(String argv[])
 {
  Frame f=new Frame("GridBagLayoutStep1");
  int fill[]={GridBagConstraints.NONE,
              GridBagConstraints.BOTH,
              GridBagConstraints.HORIZONTAL,
              GridBagConstraints.VERTICAL};
              
  int anchor[]={GridBagConstraints.EAST,
                GridBagConstraints.SOUTHEAST,
                GridBagConstraints.SOUTH,
                GridBagConstraints.SOUTHWEST,
                GridBagConstraints.WEST,
                GridBagConstraints.NORTHWEST,
                GridBagConstraints.NORTH,
                GridBagConstraints.NORTHEAST,
                GridBagConstraints.CENTER};           
  int att[][]={{0,0,1,1,1,1,GridBagConstraints.BOTH,GridBagConstraints.NORTHWEST},
               {1,0,1,1,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER},
               {2,0,1,1,1,1,GridBagConstraints.NONE,GridBagConstraints.NORTHEAST},
               {0,1,3,1,0,0,GridBagConstraints.BOTH,GridBagConstraints.CENTER}};
 
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
  gbc.weightx=att[4];
  gbc.weighty=att[5];
  //gbc.weightx=1;
  //gbc.weighty=1;
  gbc.fill=att[6];
  //gbc.anchor=att[7];
  //gbc.insets=new Insets(100,100,100,100);
  //gbc.ipadx=0;
  //gbc.ipady=0;
  con.add(com,gbc);
 }
}