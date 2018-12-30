import java.io.*;
class Master
{
 String doFileStuff() throws FileNotFoundException{return "a";}	
}	

public class EXAME5_03 extends Master
{
 public static void main(String argv[])
 {
  String s=null;
  try
  {
   s=new EXAME5_03().doFileStuff();	
  }
  catch(Exception e)
  {
   s="b";	
  }	
  System.out.println(s);
 }
 //String doFileStuff() {return "c";}
 //String doFileStuff() throws FileNotFoundException { return "c"; }
 //String doFileStuff() throws NumberFormatException { return "c"; }
 String doFileStuff() throws FileNotFoundException,NumberFormatException { return "c"; }
 
}