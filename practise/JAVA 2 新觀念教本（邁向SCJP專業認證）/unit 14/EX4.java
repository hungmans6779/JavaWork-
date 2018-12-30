import java.io.*;
public class EX4
{
 public static void main(String argv[]) throws IOException
 {
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  System.out.print("請輸入一個被除數 : ");
  
  //double d1=Double.parseDouble(bin.readLine());
  double d1=Double.valueOf(bin.readLine()).doubleValue();
  
  System.out.print("\n請輸入一個除數: ");
  //double d2=Double.parseDouble(bin.readLine());
  double d2=Double.valueOf(bin.readLine()).doubleValue();
  System.out.println("\n"+d1+"/"+d2+" = "+(d1/d2));
  bin.close();	
  in.close();	
 }
}