import java.util.*;
public class Grass
{
 String []image={"��","��","��","��","��","��","�k","��","��","��","��","��","��","��"};
 Random rm=new Random();	
 int ok=0;
 Scanner scan=new Scanner(System.in);
 public static void main(String argv[])
 {
  new Grass();

 }
 public Grass()
 {
 	String str="";
 	System.out.println("==================================================================");
 	System.out.println("�C���W�١G�N���ɤH�q�߳N");
 	System.out.println("�C���W�h");
 	System.out.println("1.�b�z���ߤ����Q�@��1��99���Ʀr");
 	System.out.println("2.�N�Ʀr���Q��ƤέӦ�Ʀr�ۥ[�]�ҡG�z�ҷQ���Ʀr34�A���N�O3+4=7�^");
 	System.out.println("3.�N�z�ҷQ���Ʀr34-7=27�A�N27�h�ݸ�27�۹������Ϥ��A�c�O...");
 	do
 	{
 	 showImage();
   System.out.println("�����@��.....(�@�I���i��ĳ���Ʊ��o�ͤF)");
   str=scan.next(); 
   System.out.println("�z���ϧάO���O�U�C���O�I�I�I");
   System.out.println("�i   "+image[ok]+"   �j");
   System.out.println("\n�K�K�I�O���O�q���z�ߤ����Ʀr�F�r�I");
   System.out.println("�o�ӵ{������q���z���߫�.....�H���H�ѱz�I");
   System.out.print("�Ы����@��A�~�򥻹C���a...(��' n '�����}���{��)=====>");
   str=scan.next(); 
  }while(!str.equals("n")); 	
 }	
 public void showImage()
 {
 	ok=rm.nextInt(14);
 	System.out.println("\n==================================================================\n");
  for(int i=1;i<=99;i++)
  {
   if(i%9!=0)
   {	
    System.out.print(i+"=>"+image[rm.nextInt(14)]+"\t");
   }
   else
   {
   	System.out.print(i+"=>"+image[ok]+"\t");
   }
   if(i%5==0) 
   { 
    System.out.println();
   }	 
  }
  System.out.println("\n==================================================================\n");
 }	
 
}