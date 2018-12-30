import java.io.*;
class T1
{
 public void throwE() 
 { }
}


class T2 extends T1
{
 public void throwE() throws ArrayIndexOutOfBoundsException
 {
  throw new ArrayIndexOutOfBoundsException();
 }
}

public class Test1_1
{
 public static void main(String argv[])
 {
 	
 }		
}