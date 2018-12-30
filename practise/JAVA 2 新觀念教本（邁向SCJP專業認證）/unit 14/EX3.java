import java.io.*;
public class EX3
{
 public static void main(String argv[]) throws IOException
 {
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  System.out.print("請輸入一個字串 : ");
  String input=bin.readLine();
  System.out.println("您輸入的字串是 : "+input);
  bin.close();	
  in.close();	
 }
}