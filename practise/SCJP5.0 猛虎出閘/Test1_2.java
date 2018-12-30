import java.io.*;
class T1
{
 public void throwE() 
 { 
  System.out.println("T1");	
 }
}


class T2 extends T1
{
 public void throwE() throws ArrayIndexOutOfBoundsException
 {
  throw new ArrayIndexOutOfBoundsException();
 }
}

public class Test1_2
{
 public static void main(String argv[])
 {
 	 
 	 T1 t1=new T2();
 	 try
 	 {
 	  t1.throwE();
 	 }
 	 catch(Exception e)
 	 {
 	 	System.out.println("我丟出一個例外了");
 	 }	 
 	 
 }		
}