 import java.io.*;
 public class StdInputv1
 {
  public static void main(String argv[])
  {
   String inputString=" ";
   System.out.print("Please input a String ¡G ");
   InputStreamReader ir=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(ir);
   try
   {
    inputString=br.readLine();
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }
   System.out.println("You input is : "+inputString);
  }
 }