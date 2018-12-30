import java.io.*;
interface It
{
 void eat() throws IOException;
}

public class InterfaceTest1 implements It
{
 public void eat() throws IOException 
 {
  System.out.println("eat");
 }
 public static void main(String argv[]) throws Exception
 {
  new InterfaceTest1().eat();	
 }
}