public class Double1
{
 public static void main(String argv[])
 {
  Double d1=new Double(1.1);
  Double d2=new Double("1.1");
  Double d3=new Double(1.2);
  
  System.out.println(d1.compareTo(d2));
  System.out.println(d1.compareTo(d3));
  System.out.println(d3.compareTo(d1));
  
  
  System.out.println(d1.equals(d2));
  System.out.println(d1.equals(d3));
  System.out.println(d2.equals(d3));
  
 }
}