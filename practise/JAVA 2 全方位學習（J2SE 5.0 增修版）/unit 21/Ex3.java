import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Ex3 implements  ActionListener,TextListener
{
 static Frame f;
 static Button bNext,bPrev,bAdd,bSave;
 static TextField tf[];
 static String field[]=new String[13];
 FileDialog fd;
 Dialog d;
 String directory,fileName;
 String file;
 MenuItem item1_3;
 int countIndex=0;
 int maxCount=1;
 int count=0;
 int noSave=1;
 AddressData data[];
 public static void main(String argv[])
 {
  new Ex3();
 }
 public Ex3()
 {
 	data=new AddressData[100];
  field[0]=new String("�s          �� �G ");
 	field[1]=new String("�m          �W �G ");
 	field[2]=new String("��          �� �G ");
 	field[3]=new String("�a  ��  �q  �� �G ");
 	field[4]=new String("�� �� �� �q �� �G ");
 	field[5]=new String("��  �u  �q  �� �G "); 
 	field[6]=new String("��  ��  ��  �X �G ");
 	field[7]=new String("��          �� �G ");
 	field[8]=new String("�q  �l  �H  �c �G ");
 	field[9]=new String("��  �H  ��  �} �G ");
 	field[10]=new String("�� �q  ��  �} �G ");
 	field[11]=new String("��         �Y �G ");
 	field[12]=new String("��         �� �G ");
  f=new Frame("Ex3 --- ²���q�T�� �x�ŧ���95�~06��27��]�p���{��");
  fd=new FileDialog(f);
  tf=new TextField[13];
  Panel p1=new Panel(new GridLayout(13,2));
  for (int i=0;i<13;i++)
  {
  	f.setFont(new Font("Arial",Font.BOLD,18));
  	f.setForeground(new Color(0,0,255));
  	tf[i]=new TextField();
  	tf[i].addTextListener(this);
  	p1.add(new Label(field[i],Label.RIGHT));
  	p1.add(tf[i]);
  }	
  tf[0].setText(Integer.toString(1));
  tf[0].setFont(new Font("Arial",Font.BOLD,20));
  tf[0].setEnabled(false);
  f.add(p1,BorderLayout.CENTER);                                                                                                                                                                                                                                                                                                           
  f.addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);	
   }			
  });	
  Panel p2=new Panel(new GridLayout(1,4));
  bNext=new Button("�U�@�����");
  bNext.setEnabled(false);
  bNext.setFont(new Font("Arial",Font.PLAIN,22));
  bNext.setForeground(new Color(255,0,0));
  bNext.addActionListener(this);
  bNext.setActionCommand("1");
  bPrev=new Button("�W�@�����");
  bPrev.setEnabled(false);
  bPrev.setFont(new Font("Arial",Font.PLAIN,22));
  bPrev.setForeground(new Color(255,0,0));
  bPrev.addActionListener(this);
  bPrev.setActionCommand("2");
  bAdd=new Button("�s�W���");
  bAdd.setFont(new Font("Arial",Font.PLAIN,22));
  bAdd.setForeground(new Color(255,0,0));
  bAdd.addActionListener(this);
  bAdd.setActionCommand("3");
  bSave=new Button("�x�s�������");
  bSave.setEnabled(false);
  bSave.setFont(new Font("Arial",Font.PLAIN,22));
  bSave.setForeground(new Color(255,0,0));
  bSave.addActionListener(this);
  bSave.setActionCommand("4");
  p2.add(bPrev);
  p2.add(bNext);
  p2.add(bAdd);
  p2.add(bSave);
  Menu item1=new Menu("�ɮ�");
  item1.setFont(new Font("Arial",Font.PLAIN,12));
   
  //�}�s�ɮ�
  MenuShortcut ms1=new MenuShortcut(KeyEvent.VK_N,false);
  MenuItem item1_1=new MenuItem("�}�s�ɮ�",ms1);
  item1_1.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	bNext.setEnabled(false);
   	bPrev.setEnabled(false);
   	f.setTitle("Ex3 --- ²���q�T�� �x�ŧ���95�~06��27��]�p���{��");
   	fileName=null;
   	countIndex=0;
   	maxCount=1;
   	for(int i=0;i<13;i++)
    {
  	 tf[i].setText("");
    }	
    tf[0].setText(Integer.toString(1));
   }
  });
 
  //�}������
  MenuShortcut ms2=new MenuShortcut(KeyEvent.VK_O,false);
  MenuItem item1_2=new MenuItem("�}������",ms2);
  item1_2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	fd.setMode(FileDialog.LOAD);
   	fd.setTitle("�}������ ----- �x�ŧ���95�~06��27��]�p���{��");
   	fd.setVisible(true); 	
   	fileName=fd.getFile();
   	directory=fd.getDirectory();
    file=directory+fileName;
    if(fileName!=null)
    {
     f.setTitle("Ex3 --- ²���q�T��( "+fileName+" )�x�ŧ���95�~06��27��]�p���{��");  	
    } 
    if(fileName!=null)
    {
     try
     {
      FileInputStream fIn=new FileInputStream(file);
      ObjectInputStream objIn=new ObjectInputStream(fIn);
      bPrev.setEnabled(false);
    	bNext.setEnabled(true);
    	int sureCount=0;    
      for(int i=0;i<data.length;i++)
      {
       try
       {	
        data[i]=new AddressData();	
        data[i]=(AddressData)objIn.readObject();
       }
       catch(EOFException eofe)
       { }	 
      }	
      showData(0);
      maxCount=data[0].serialNumber;
      try
      {
       for(int i=1;i<data.length;i++)
       {
        if(maxCount<data[i].serialNumber)
        {
         maxCount=data[i].serialNumber;	
        }
       }
       count=0;
   	   countIndex=maxCount-1;
      } 
      catch(NullPointerException npe)
      {
      } 
      countIndex=maxCount-1;
      objIn.close();
      fIn.close();
     }
     catch(StreamCorruptedException sce)
     {
     	d=new Dialog(f,"�z�}�Ҫ��ɮפ��O�q�T���M�Ϊ��榡",true);
     	Label l=new Label("�V���{�����]�p�̸߰ݦp��ϥ�",Label.CENTER);
     	fileName=null;
     	directory=null;
     	file=null;
     	l.setFont(new Font("Arial",Font.BOLD,22));
     	l.setForeground(new Color(255,0,0));
     	d.add(l,BorderLayout.CENTER);
     	d.setSize(350,100);
     	d.setLocation(80,200);
     	d.addWindowListener(new WindowAdapter()
     	{
     	 public void windowClosing(WindowEvent e)
     	 {
     		d.dispose();
     	 }		
     	});
     d.setVisible(true);	
     }	
     catch(Exception ee)
     {
      ee.printStackTrace();
     }		
    }	 
   }		
  });	    
   bSave.setEnabled(false);
 
 //�x�s�ɮ�
  MenuShortcut ms3=new MenuShortcut(KeyEvent.VK_S,false);
  item1_3=new MenuItem("�x�s�ɮ�",ms3);
  item1_3.setEnabled(false);
  item1_3.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
    saveFile();  	
   }
  });

  //�t�s�s��
  MenuShortcut ms4=new MenuShortcut(KeyEvent.VK_S,true);
  MenuItem item1_4=new MenuItem("�t�s�s��",ms4);
  item1_4.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	fd.setMode(FileDialog.SAVE);
   	fd.setTitle("�t�s�s�� ----- �x�ŧ���95�~06��27��]�p���{��");
   	fd.setVisible(true); 	
   	fileName=fd.getFile();
   	directory=fd.getDirectory();
   	file=directory+fileName;
   	if(fileName!=null)
    {
     f.setTitle("Ex3 --- ²���q�T��( "+fileName+" )�x�ŧ���95�~06��27��]�p���{��");  	
    } 
   	if(fileName!=null)
   	{ 
   	 try
   	 {
   	 	accessData(countIndex);
   	  FileOutputStream fOut=new FileOutputStream(file);
   	  ObjectOutputStream objOut=new ObjectOutputStream(fOut);
   	  for(int i=0;i<=countIndex;i++)
   	  {
   	   objOut.writeObject(data[i]);
   	  } 
   	  objOut.close();
   	  fOut.close();
   	 }
   	 catch(IOException ioe)
   	 {
   	  ioe.printStackTrace();	
   	 }
   	} 	
   }	
  }); 
  MenuShortcut ms5=new MenuShortcut(KeyEvent.VK_X,false);
  MenuItem item1_5=new MenuItem("���}",ms5);
  item1_5.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	System.exit(0);
   }
  });  
  item1.add(item1_1);
  item1.add(item1_2);
  item1.addSeparator();
  item1.add(item1_3);
  item1.add(item1_4);
  item1.addSeparator();
  item1.add(item1_5);
  MenuBar bar=new MenuBar();
  bar.add(item1);
  f.setMenuBar(bar);  
  f.add(p2,BorderLayout.SOUTH);
  f.pack();
  f.setVisible(true);
 }	
 
 public void textValueChanged(TextEvent e)
 {
  item1_3.setEnabled(true);
  if(noSave==0)
  {
   bSave.setEnabled(true);
  } 
 }	
 
 public void actionPerformed(ActionEvent e)
 {
 	Button b=(Button)e.getSource();
 	int select=Integer.parseInt(b.getActionCommand()); 	
 	switch(select)
 	{
 	 //�U�@�����	
 	 case 1: 
 	  if(noSave==0)
 	  {
 	   accessData(countIndex);
 	   noSave=1;	
 	  }	
 	  count++;
 	  showData(count);
 	  bPrev.setEnabled(true);
 	  if(count==maxCount-1)
 	  { bNext.setEnabled(false); }
 	 break;	
 	  
 	 //�W�@����� 
 	 case 2:	  
 	  if(noSave==0)
 	  {
 	   accessData(countIndex);
 	   noSave=1;	
 	  }	
 	  bNext.setEnabled(true);
 	  if(count==1)
 	  { bPrev.setEnabled(false); }	
 	  count--;
 	  showData(count);
 	 break; 
 	  
 	 //�s�W���
 	 case 3:
 	   accessData(count);  
 	   maxCount++;
 	   countIndex=maxCount-1;
 	   count=countIndex;
     for(int i=0;i<13;i++)
     {
     	tf[i].setText("");
     }	
     tf[0].setText(Integer.toString(maxCount));
     bNext.setEnabled(false);
     bPrev.setEnabled(true);    
     noSave=0;
  	  break; 
 	  
 	 //�x�s�������
 	 case 4:
    accessData(countIndex);
    saveFile();
    bSave.setEnabled(false);
 	  break;	
 	}	
 }
 
 //�Ndata[]����ƨ̯��ޭ���ܨ�e���U���W�F
 public void showData(int num)
 {
  tf[0].setText(Integer.toString(data[num].serialNumber));  	
 	tf[1].setText(data[num].name);
 	tf[2].setText(data[num].birtyday);
 	tf[3].setText(data[num].homeTelephone);
 	tf[4].setText(data[num].officeTelephone);
 	tf[5].setText(data[num].videophone);
 	tf[6].setText(data[num].cellPhone);
 	tf[7].setText(data[num].webSite);
 	tf[8].setText(data[num].email);
 	tf[9].setText(data[num].address);
 	tf[10].setText(data[num].companyAddress);
 	tf[11].setText(data[num].concern);
 	tf[12].setText(data[num].remarks);
 	bSave.setEnabled(false);
 }	
 public void accessData(int nuu)
 { 
 	 data[nuu]=new AddressData();
 	 data[nuu].serialNumber=Integer.parseInt(tf[0].getText());
   data[nuu].name=tf[1].getText(); 
   data[nuu].birtyday=tf[2].getText(); 
   data[nuu].homeTelephone=tf[3].getText(); 
   data[nuu].officeTelephone=tf[4].getText();  
   data[nuu].videophone=tf[5].getText(); 
   data[nuu].cellPhone=tf[6].getText();   
   data[nuu].webSite=tf[7].getText();  
   data[nuu].email=tf[8].getText();  
   data[nuu].address=tf[9].getText();         
   data[nuu].companyAddress=tf[10].getText();  
   data[nuu].concern=tf[11].getText();         
   data[nuu].remarks=tf[12].getText();     
 }	 
 
 public void saveFile()
 {
 	if(fileName==null)
 	{
 	 fd.setMode(FileDialog.SAVE);
 	 fd.setTitle("�x�s�ɮ� ----- �x�ŧ���95�~06��27��]�p���{��");
 	 fd.setVisible(true);
 	 fileName=fd.getFile();
   directory=fd.getDirectory();
   file=directory+fileName;
   if(fileName!=null)
   {
    f.setTitle("Ex3 --- ²���q�T��( "+fileName+" )�x�ŧ���95�~06��27��]�p���{��");  	
   } 
  } 
  if(fileName!=null)
  {
 	 try
   {
    accessData(countIndex);
 	  FileOutputStream fOut=new FileOutputStream(fileName);
 	  ObjectOutputStream objOut=new ObjectOutputStream(fOut);
 	  for(int i=0;i<=countIndex;i++)
   	{
   	 objOut.writeObject(data[i]);
   	} 
   	 objOut.close();
 	   fOut.close();		
   }	
 	 catch(IOException ioe)
   {
 	  ioe.printStackTrace();	
 	 }
  }
 }	
}




class AddressData implements Serializable
{
  public int serialNumber;       //�s��
  public String name;            //�m�W
  public String birtyday;        //�ͤ�
  public String homeTelephone;   //�a�̹q��
  public String officeTelephone; //�줽�ǹq��
  public String videophone;      //�ǯu�q��
  public String cellPhone;       //������X
  public String webSite;         //����
  public String email;           //�q�l�H�c
  public String address;         //�ӤH��}
  public String companyAddress;  //���q��}
  public String concern;         //���Y
  public String remarks;         //�Ƶ�	 	
}	
