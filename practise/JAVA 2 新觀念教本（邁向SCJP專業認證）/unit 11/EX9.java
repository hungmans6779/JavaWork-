import java.io.*;
public class EX9
{
 public void method() throws IOException
 {}
 public static void main(String argv[])
 {
 
 }
}

class B extends EX9
{
 public void method() 
 {}	
}	

class C extends EX9
{
 public void method() throws EOFException
 {
 	
 }		
}	

class D extends EX9
{
 public void method() throws IOException
 {}	
}	