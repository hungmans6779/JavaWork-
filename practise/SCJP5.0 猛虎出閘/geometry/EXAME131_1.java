//package geometry;
public class EXAME131_1
{
 InnerTriangle it=new InnerTriangle();
 //System.out.println("it.base = "+it.base);
 //System.out.println("it.height = "+it.height);
 public static void main(String argv[])
 {
 	EXAME131_1.InnerTriangle its=new EXAME131_1().new InnerTriangle();
 	System.out.println("base = "+its.base);
 	System.out.println("height = "+its.height);
 }	
 class InnerTriangle extends Thread
 {
 	public int base=63;
 	public int height=171;
 }	
}