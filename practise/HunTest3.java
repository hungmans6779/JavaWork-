import java.awt.*;
import java.awt.event.*;

public class HunTest3 extends Frame
{
 int count=0;
 TextField tf; 
 Label [] disk;
 public static void main(String argv[])
 {
  new HunTest3();
 }
 public HunTest3()
 {
 	setLayout(null);
 	Label label=new Label("�п�J�z���L�l��");
 	label.setSize(new Dimension(100,20));
 	label.setLocation(700,50);
 	tf=new TextField("3");
 	tf.setSize(new Dimension(50,20));
 	tf.setLocation(800,50);
 	Button buttonRun=new Button("�}�l����");
 	final Button buttonClear=new Button("�M���e��");
 	buttonRun.setLocation(850,50);
 	buttonRun.setSize(new Dimension(80,20));
 	buttonRun.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent ae)
 	 {
 	 	if(tf.getText().matches("\\d*"))
 	 	{
 	 	 buttonClear.setEnabled(true);	
     disk=new Label[Integer.parseInt(tf.getText())];   
     for(int i=0;i<disk.length;i++)
     {
     	int hasDisk=disk.length;
     	int width=100-10*i;
     	int height=30;
      disk[i]=new Label();
      disk[i].setLocation(205-width/2,570-height*i);
      disk[i].setSize(new Dimension(width,height));
      disk[i].setBackground(new Color(10*i>=255?255:10*i,i*(255/hasDisk),i*(255/hasDisk)));
      add(disk[i]);	
     }	
     hun(3,"A","B","C");
    }  
 	 	else
 	 	 setTitle("�z��J���榡���~�I�Э��s��J���ԧB�Ʀr�I�I�I");
 	 }		
 	});
 

  buttonClear.setEnabled(false);
  buttonClear.setLocation(930,50);
 	buttonClear.setSize(new Dimension(80,20));
 	//�M���e��
 	buttonClear.addActionListener(new ActionListener()
 	{
 	 public void actionPerformed(ActionEvent ae)
 	 {
 	 	for(int i=0;i<disk.length;i++)
 	 	{
 	 	 remove(disk[i]);
 	 	}	
 	 }		
 	});	
 	
  add(label); 
 	add(tf);
 	add(buttonRun);
  add(buttonClear);
  
  //��ť�ثe�ƹ����y�Ц�m
 	addMouseMotionListener(new MouseAdapter()
 	{
 	 public void mouseMoved(MouseEvent me)
 	 {
 	 	setTitle(me.getX()+","+me.getY());
 	 }		
 	});		
 	
 	addWindowListener(new WindowAdapter()
 	{
 	 public void windowClosing(WindowEvent we)
 	 {
 	  System.exit(0);	
 	 }		
 	});	

 	setTitle("�e����{��---�x�ŧ�");
 	setLocation(100,0);
 	setResizable(false);
  setSize(new Dimension(1050,700));	
  show();
 }	
 //�e�����k
 public void hun(int n,String a,String b,String c)
 {
  if(n==1)
  {
   System.out.println("�� "+(++count)+" ��===>"+"from "+a+" to "+c);	
  } 
  else
  {
   hun(n-1,a,c,b);
   System.out.println("�� "+(++count)+" ��===>"+"from "+a+" to "+c);	
   hun(n-1,b,a,c);	
  }	
 }
 //�e�X����
 public void showP(Graphics g)
 {
 	g.setFont(new Font("dialog",Font.BOLD,24));
  g.setColor(Color.RED);
 	g.fillRect(200,300,10,300);	
 	g.fillRect(110,600,190,10); //�e�X���L
 	g.drawString("A�L",190,650);
 	g.fillRect(500,300,10,300);	
 	g.fillRect(410,600,190,10); //�e�X���L
 	g.drawString("B�L",490,650);
 	g.fillRect(800,300,10,300);	
 	g.fillRect(710,600,190,10); //�e�X���L
 	g.drawString("C�L",790,650);
 }	
 public void paint(Graphics g)
 {
  showP(g);
 }	
 
 	
}