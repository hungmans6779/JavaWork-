import java.awt.*;
public class Ex2_1
{
 public static void main(String argv[])
 {
  Frame f=new Frame("GridBagLayout Simulation BordLayout----- 洪嘉宏於95年06月13日設計");
  f.setLayout(new GridBagLayout());
  int att[][]={{0,0,3,1,0,0},
               {0,1,1,1,0,1},
               {1,1,1,1,1,1},
               {2,1,1,1,0,1},
               {0,2,3,1,0,0}};
  Button b[]=new Button[5];
  for(int i=0;i<b.length;i++)
  {
   b[i]=new Button("Button"+(i+1));
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
 	gbc.fill=GridBagConstraints.BOTH;
 	gbc.anchor=GridBagConstraints.CENTER;
 	con.add(com,gbc);
 }	
}