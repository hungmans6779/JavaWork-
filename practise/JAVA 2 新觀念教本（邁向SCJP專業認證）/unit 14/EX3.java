import java.io.*;
public class EX3
{
 public static void main(String argv[]) throws IOException
 {
  InputStreamReader in=new InputStreamReader(System.in);
  BufferedReader bin=new BufferedReader(in);
  System.out.print("�п�J�@�Ӧr�� : ");
  String input=bin.readLine();
  System.out.println("�z��J���r��O : "+input);
  bin.close();	
  in.close();	
 }
}