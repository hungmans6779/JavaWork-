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
  field[0]=new String("編          號 ： ");
 	field[1]=new String("姓          名 ： ");
 	field[2]=new String("生          日 ： ");
 	field[3]=new String("家  裡  電  話 ： ");
 	field[4]=new String("辦 公 室 電 話 ： ");
 	field[5]=new String("傳  真  電  話 ： "); 
 	field[6]=new String("手  機  號  碼 ： ");
 	field[7]=new String("網          頁 ： ");
 	field[8]=new String("電  子  信  箱 ： ");
 	field[9]=new String("個  人  住  址 ： ");
 	field[10]=new String("公 司  住  址 ： ");
 	field[11]=new String("關         係 ： ");
 	field[12]=new String("備         註 ： ");
  f=new Frame("Ex3 --- 簡易通訊錄 洪嘉宏於95年06月27日設計的程式");
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
  bNext=new Button("下一筆資料");
  bNext.setEnabled(false);
  bNext.setFont(new Font("Arial",Font.PLAIN,22));
  bNext.setForeground(new Color(255,0,0));
  bNext.addActionListener(this);
  bNext.setActionCommand("1");
  bPrev=new Button("上一筆資料");
  bPrev.setEnabled(false);
  bPrev.setFont(new Font("Arial",Font.PLAIN,22));
  bPrev.setForeground(new Color(255,0,0));
  bPrev.addActionListener(this);
  bPrev.setActionCommand("2");
  bAdd=new Button("新增資料");
  bAdd.setFont(new Font("Arial",Font.PLAIN,22));
  bAdd.setForeground(new Color(255,0,0));
  bAdd.addActionListener(this);
  bAdd.setActionCommand("3");
  bSave=new Button("儲存此筆資料");
  bSave.setEnabled(false);
  bSave.setFont(new Font("Arial",Font.PLAIN,22));
  bSave.setForeground(new Color(255,0,0));
  bSave.addActionListener(this);
  bSave.setActionCommand("4");
  p2.add(bPrev);
  p2.add(bNext);
  p2.add(bAdd);
  p2.add(bSave);
  Menu item1=new Menu("檔案");
  item1.setFont(new Font("Arial",Font.PLAIN,12));
   
  //開新檔案
  MenuShortcut ms1=new MenuShortcut(KeyEvent.VK_N,false);
  MenuItem item1_1=new MenuItem("開新檔案",ms1);
  item1_1.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	bNext.setEnabled(false);
   	bPrev.setEnabled(false);
   	f.setTitle("Ex3 --- 簡易通訊錄 洪嘉宏於95年06月27日設計的程式");
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
 
  //開啟舊檔
  MenuShortcut ms2=new MenuShortcut(KeyEvent.VK_O,false);
  MenuItem item1_2=new MenuItem("開啟舊檔",ms2);
  item1_2.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	fd.setMode(FileDialog.LOAD);
   	fd.setTitle("開啟舊檔 ----- 洪嘉宏於95年06月27日設計的程式");
   	fd.setVisible(true); 	
   	fileName=fd.getFile();
   	directory=fd.getDirectory();
    file=directory+fileName;
    if(fileName!=null)
    {
     f.setTitle("Ex3 --- 簡易通訊錄( "+fileName+" )洪嘉宏於95年06月27日設計的程式");  	
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
     	d=new Dialog(f,"您開啟的檔案不是通訊錄專用的格式",true);
     	Label l=new Label("向本程式的設計者詢問如何使用",Label.CENTER);
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
 
 //儲存檔案
  MenuShortcut ms3=new MenuShortcut(KeyEvent.VK_S,false);
  item1_3=new MenuItem("儲存檔案",ms3);
  item1_3.setEnabled(false);
  item1_3.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
    saveFile();  	
   }
  });

  //另存新檔
  MenuShortcut ms4=new MenuShortcut(KeyEvent.VK_S,true);
  MenuItem item1_4=new MenuItem("另存新檔",ms4);
  item1_4.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
   	fd.setMode(FileDialog.SAVE);
   	fd.setTitle("另存新檔 ----- 洪嘉宏於95年06月27日設計的程式");
   	fd.setVisible(true); 	
   	fileName=fd.getFile();
   	directory=fd.getDirectory();
   	file=directory+fileName;
   	if(fileName!=null)
    {
     f.setTitle("Ex3 --- 簡易通訊錄( "+fileName+" )洪嘉宏於95年06月27日設計的程式");  	
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
  MenuItem item1_5=new MenuItem("離開",ms5);
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
 	 //下一筆資料	
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
 	  
 	 //上一筆資料 
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
 	  
 	 //新增資料
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
 	  
 	 //儲存此筆資料
 	 case 4:
    accessData(countIndex);
    saveFile();
    bSave.setEnabled(false);
 	  break;	
 	}	
 }
 
 //將data[]的資料依索引值顯示到畫面各欄位上；
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
 	 fd.setTitle("儲存檔案 ----- 洪嘉宏於95年06月27日設計的程式");
 	 fd.setVisible(true);
 	 fileName=fd.getFile();
   directory=fd.getDirectory();
   file=directory+fileName;
   if(fileName!=null)
   {
    f.setTitle("Ex3 --- 簡易通訊錄( "+fileName+" )洪嘉宏於95年06月27日設計的程式");  	
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
  public int serialNumber;       //編號
  public String name;            //姓名
  public String birtyday;        //生日
  public String homeTelephone;   //家裡電話
  public String officeTelephone; //辦公室電話
  public String videophone;      //傳真電話
  public String cellPhone;       //手機號碼
  public String webSite;         //網頁
  public String email;           //電子信箱
  public String address;         //個人住址
  public String companyAddress;  //公司住址
  public String concern;         //關係
  public String remarks;         //備註	 	
}	
