import java.io.*;
public class EX4_1
{
 public static void main(String argv[])
 {
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  try
  {
   System.out.print("�п�J�@�ӳQ���� : ");
   
   //double d1=Double.parseDouble(bin.readLine());
   double d1=Double.valueOf(bin.readLine()).doubleValue();
  
   System.out.print("\n�п�J�@�Ӱ���: ");
   //double d2=Double.parseDouble(bin.readLine());
   double d2=Double.valueOf(bin.readLine()).doubleValue();
   System.out.println("\n"+d1+"/"+d2+" = "+(d1/d2));
   bin.close();	
   in.close();	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();
  } 
 }
}