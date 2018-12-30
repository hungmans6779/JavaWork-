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
  System.out.print("\n\n�п�J�z���~��=");
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
    System.out.println("�A��"+year+"���A�ҥH�����|�v.");
    projectThatElect();
    programPost();
  }
  else
  {
   System.out.println("�A����20���A�ҥH�S�����|�v�I");
  } 
 }  
  
 public static void programPost()
 {
  do
   {	
    System.out.print("�z����ܶ��جO: ");
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
      System.out.println("�z���ﶵ���勵���`��......�I");
      Post.showPost1();
      break;
     case 2:
      System.out.println("�z���ﶵ����ߪk�e��.......�I");
      Post.showPost2();
      break;
     case 3:
      System.out.println("�z���ﶵ���￤��ĳ��.........�I");
      Post.showPost3();
      break;
     case 4:
      Author.showAuthor(); 
      System.out.println("\n���±z�ϥΥ��{��.............."); 
      System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      System.exit(0);
      break;
     default:
      System.out.println("�z����J���ئ��~..............�I"); 	
      projectThatElect();
    }	
   }while(select!=0);
 }
 
 public static void projectThatElect()
 {
   System.out.println("=================================");
   System.out.println("�A�Q�勵���`��........�A�Ы��i1�j");
   System.out.println("�A�Q��ߪk�e��........�A�Ы��i2�j");
   System.out.println("�A�Q�￤�����M����ĳ���A�Ы��i3�j");
   System.out.println("�A���Q�諸��..........�A�Ы��i4�j");
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
   System.out.println("��I���`�Ϊo���h�h�A�Ĥ@�a�x���]�h�h��......");
   System.out.println("�z����ܶ��ئp�U");
   projectThatElect1();
    do
   { 
     inputSelect1();
     switch(select1)
     {
      case 1: 
       Author.showAuthor(); 
       System.out.println("\n�b�������z���Q����`���o�I......");
       System.out.println("\n���±z�ϥΥ��{��.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");     
       System.exit(0);
       break;
      case 2:
       System.out.println("\n��A�z���n���`�ΤF�r�I���^��䥦�����|�F....");
       Index.projectThatElect();
       Index.programPost();
       break;
      case 3:
       Author.showAuthor();
       System.out.println("\n���±z�ϥΥ��{��.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");  
       System.exit(0);  
       break;
      default:
       System.out.println("�z���ﶵ��J���~��I�Э��s��J........");
       
       projectThatElect1();
     } 
   }while(select1!=0);      
  } 
  
  public static void showPost2()
  {
   System.out.println("\n\n\n");
   System.out.println("=================================================");
   System.out.println("��I�ߪk�e���i�n�n�n�m����r�A���[�~�i�H��Ĺ");
   System.out.println("�z����ܶ��ئp�U");
   projectThatElect2();
    do
   { 
     inputSelect1();
     switch(select1)
     {
      case 1:
       Author.showAuthor(); 
       System.out.println("\n�b�������z���Q����`���o�I......");
       System.out.println("\n���±z�ϥΥ��{��.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");     
       System.exit(0);
       break;
      case 2:
       System.out.println("\n��A�z���n��ߪk�e���F�r�I���^��䥦�����|�F....");
       Index.projectThatElect();
       Index.programPost();
       break;
      case 3:
       Author.showAuthor();
       System.out.println("\n���±z�ϥΥ��{��..............");
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
       System.exit(0);  
       break;
      default:
       System.out.println("�z���ﶵ��J���~��I�Э��s��J........");
       projectThatElect2();
     } 
   }while(select1!=0);          
  } 
  
  public static void showPost3()
  {
   System.out.println("\n\n\n");
   System.out.println("=================================================");
   System.out.println("��I�￤��ĳ���i�n�d�n�a�訤�Y�Ѥj��........");
   System.out.println("�z����ܶ��ئp�U");
   projectThatElect3();
    do
   { 
     inputSelect1();
     switch(select1)
     {
      case 1:
       Author.showAuthor(); 
       System.out.println("\n�b�������z���Q����`���o�I......");
       System.out.println("\n���±z�ϥΥ��{��.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");      
       System.exit(0);
       break;
      case 2:
       System.out.println("\n��A�z���n�￤��ĳ���F�r�I���^��䥦�����|�F....");
       Index.projectThatElect();
       Index.programPost();
       break;
      case 3:
       Author.showAuthor();
       System.out.println("\n���±z�ϥΥ��{��.............."); 
       System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");  
       System.exit(0);  
       break;
      default:
       System.out.println("�z���ﶵ��J���~��I�Э��s��J........");
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
   System.out.println("�T�w�n���`�Ϊ��ܡA�Ы�..................�i1�j");
   System.out.println("�T�w���n���`�ΡA�æ^��䥦���|���ءA�Ы��i2�j");
   System.out.println("�p�G���Q��F�A�n���}���{�����ܡA�Ы�....�i3�j");
   System.out.println("=============================================");
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   System.out.print("\n�п�J�z���ﶵ�G"); 
  }
  
   public static void projectThatElect2()
  {
   System.out.println("=================================================");
   System.out.println("�T�w�n��ߪk�e�����ܡA�Ы�..................�i1�j");
   System.out.println("�T�w���n��ߪk�e���A�æ^��䥦���|���ءA�Ы��i2�j");
   System.out.println("�p�G���Q��F�A�n���}���{�����ܡA�Ы�........�i3�j");
   System.out.println("=================================================");
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   System.out.print("\n�п�J�z���ﶵ�G");
  }
   public static void projectThatElect3()
  {
   System.out.println("=================================================");
   System.out.println("�T�w�n�￤��ĳ�����ܡA�Ы�..................�i1�j");
   System.out.println("�T�w���n�￤��ĳ���A�æ^��䥦���|���ءA�Ы��i2�j");
   System.out.println("�p�G���Q��F�A�n���}���{�����ܡA�Ы�........�i3�j");
   System.out.println("=================================================");
   System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   System.out.print("\n�п�J�z���ﶵ�G");
  }
 }