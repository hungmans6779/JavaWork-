import java.util.*;
public class Test34
{
 public static void main(String argv[])
 {
  Scanner scan=new Scanner(System.in);
  String str="";
  while(true)
  {
   System.out.print("�п�J���@���:");	
   int number=scan.nextInt(); 	
   int temp=number;
   boolean answer=true;
   for(int i=2;i<=number/2+1;i+=i==2?1:2)
   {
    answer=(number%i==0); //number%i==0�Otrue�ɡA�N���O���
    if(answer)
    { i=number; }
   }		
   if(answer)
    System.out.println(temp+"���O���");
   else
    System.out.println(temp+"�O���");
   System.out.println("======================"); 
  }
 }
}