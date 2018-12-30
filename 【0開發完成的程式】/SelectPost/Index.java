import java.io.*;

class Index
{
 static int year;	 
 static int select;
 public static void main(String argv[])
 {
  Author.showAuthor();
  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
 	InputStreamReader ir=new InputStreamReader(System.in);
 	BufferedReader br=new BufferedReader(ir); 
  System.out.print("\n\n請輸入您的年紀=");
  try
  {
   year=Integer.parseInt(br.readLine());	  	
  }
  catch (IOException e)
  {
  	e.printStackTrace();
  }
  if(year>=20)
  {
    System.out.println("=================================");
    System.out.println("你滿"+year+"歲，所以有選舉權.");
    projectThatElect();
    programPost();
  }
  else
  {
   System.out.println("你未滿20歲，所以沒有選舉權！");
  } 
 }  
  
 public static void programPost()
 {
  do
   {	
    System.out.print("您的選擇項目是: ");
    InputStreamReader inputSelect=new InputStreamReader(System.in);
    BufferedReader brSelect=new BufferedReader(inputSelect);
    try
    {
      select=Integer.parseInt(brSelect.readLine());	
    }		
    catch(IOException e)
    {
     e.printStackTrace();	
    }	
    switch(select)
    {
     case 1:
      System.out.println("您的選項為選正副總統......！");
      Post.showPost1();
      break;
     case 2:
      System.out.println("您的選項為選立法委員.......！");
      Post.showPost2();
      break;
     case 3:
      System.out.println("您的選項為選縣市議員.........！");
      Post.showPost3();
      break;
     case 4:
      Author.showAuthor(); 
      System.out.println("\n謝謝您使用本程式.............."); 
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.exit(0);
      break;
     default:
      System.out.println("您的輸入項目有誤..............！"); 	
      projectThatElect();
    }	
   }while(select!=0);
 }
 
 public static void projectThatElect()
 {
   System.out.println("=================================");
   System.out.println("你想選正副總統........，請按【1】");
   System.out.println("你想選立法委員........，請按【2】");
   System.out.println("你想選縣市長和縣市議員，請按【3】");
   System.out.println("你不想選的話..........，請按【4】");
   System.out.println("=================================");
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
 }     
}

 class Post
 {
   static int select1=0;
   public static void showPost1()
  {
   System.out.println("\n\n\n");
   System.out.println("=============================================");
   System.out.println("嗯！選總統油水多多，第一家庭錢也多多喔......");
   System.out.println("您的選擇項目如下");
   projectThatElect1();
    do
   { 
     inputSelect1();
     switch(select1)
     {
      case 1: 
       Author.showAuthor(); 
       System.out.println("\n在此恭祝您順利當選總統囉！......");
       System.out.println("\n謝謝您使用本程式.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");     
       System.exit(0);
       break;
      case 2:
       System.out.println("\n嗯，您不要選總統了呀！那回到其它的選舉了....");
       Index.projectThatElect();
       Index.programPost();
       break;
      case 3:
       Author.showAuthor();
       System.out.println("\n謝謝您使用本程式.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");  
       System.exit(0);  
       break;
      default:
       System.out.println("您的選項輸入錯誤喔！請重新輸入........");
       
       projectThatElect1();
     } 
   }while(select1!=0);      
  } 
  
  public static void showPost2()
  {
   System.out.println("\n\n\n");
   System.out.println("=================================================");
   System.out.println("嗯！立法委員可要好好練身體呀，打架才可以打贏");
   System.out.println("您的選擇項目如下");
   projectThatElect2();
    do
   { 
     inputSelect1();
     switch(select1)
     {
      case 1:
       Author.showAuthor(); 
       System.out.println("\n在此恭祝您順利當選總統囉！......");
       System.out.println("\n謝謝您使用本程式.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");     
       System.exit(0);
       break;
      case 2:
       System.out.println("\n嗯，您不要選立法委員了呀！那回到其它的選舉了....");
       Index.projectThatElect();
       Index.programPost();
       break;
      case 3:
       Author.showAuthor();
       System.out.println("\n謝謝您使用本程式..............");
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
       System.exit(0);  
       break;
      default:
       System.out.println("您的選項輸入錯誤喔！請重新輸入........");
       projectThatElect2();
     } 
   }while(select1!=0);          
  } 
  
  public static void showPost3()
  {
   System.out.println("\n\n\n");
   System.out.println("=================================================");
   System.out.println("嗯！選縣市議員可要搞好地方角頭老大喔........");
   System.out.println("您的選擇項目如下");
   projectThatElect3();
    do
   { 
     inputSelect1();
     switch(select1)
     {
      case 1:
       Author.showAuthor(); 
       System.out.println("\n在此恭祝您順利當選總統囉！......");
       System.out.println("\n謝謝您使用本程式.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");      
       System.exit(0);
       break;
      case 2:
       System.out.println("\n嗯，您不要選縣市議員了呀！那回到其它的選舉了....");
       Index.projectThatElect();
       Index.programPost();
       break;
      case 3:
       Author.showAuthor();
       System.out.println("\n謝謝您使用本程式.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");  
       System.exit(0);  
       break;
      default:
       System.out.println("您的選項輸入錯誤喔！請重新輸入........");
       projectThatElect3();
     } 
   }while(select1!=0);      
  }   
   public static void inputSelect1()
   {
    try
    {
     select1=0;
     InputStreamReader irSelect1=new InputStreamReader(System.in);
     BufferedReader brSelect1=new BufferedReader(irSelect1);
     select1=Integer.parseInt(brSelect1.readLine());
    }
    catch(IOException e)
    {
     e.printStackTrace();
    }
   }    
   
   public static void projectThatElect1()
  {
   System.out.println("=============================================");
   System.out.println("確定要選總統的話，請按..................【1】");
   System.out.println("確定不要選總統，並回到其它選舉項目，請按【2】");
   System.out.println("如果不想選了，要離開本程式的話，請按....【3】");
   System.out.println("=============================================");
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   System.out.print("\n請輸入您的選項："); 
  }
  
   public static void projectThatElect2()
  {
   System.out.println("=================================================");
   System.out.println("確定要選立法委員的話，請按..................【1】");
   System.out.println("確定不要選立法委員，並回到其它選舉項目，請按【2】");
   System.out.println("如果不想選了，要離開本程式的話，請按........【3】");
   System.out.println("=================================================");
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   System.out.print("\n請輸入您的選項：");
  }
   public static void projectThatElect3()
  {
   System.out.println("=================================================");
   System.out.println("確定要選縣市議員的話，請按..................【1】");
   System.out.println("確定不要選縣市議員，並回到其它選舉項目，請按【2】");
   System.out.println("如果不想選了，要離開本程式的話，請按........【3】");
   System.out.println("=================================================");
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   System.out.print("\n請輸入您的選項：");
  }
 }