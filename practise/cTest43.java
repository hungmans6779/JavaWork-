import java.io.*;
public class cTest43
{
 public static void main(String argv[])
 {
  Aa a=new Aa();
  a.aaa(); 
 } 
}

class A
{
 public void aaa() throws IOException
 {
  System.out.println("A");
 }
}

class Aa extends A
{
 public void aaa()
 {
  System.out.println("Aa");
 }
}



class B
{
 public int show()
 {
  return 10;
 }		
}	

class Bb extends B
{
 public int show()
 {
 	return 10;
 }		
}	
