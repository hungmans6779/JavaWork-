import java.io.*;
class Food
{
 Food()
 {	
  System.out.println("1");
 } 
}

class Fruit extends Food implements Serializable
{
 Fruit()
 {
 	System.out.println("2");
 }		
}	

public class EXAME140 extends Fruit 
{
 int size=42;
 public static void main(String argv[])
 {
  EXAME140 b=new EXAME140();
  b.serializeEXAME140(b);	
  b=b.deserializeEXAME140(b);
  System.out.println("restored " +b.size+" ");
 }	
}