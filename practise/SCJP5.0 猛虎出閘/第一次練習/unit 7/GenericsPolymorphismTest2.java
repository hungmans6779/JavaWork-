import java.util.*;
public class GenericsPolymorphismTest2
{
 public static void main(String argv[])
 {
  Vector<Integer>v=new Vector<Integer>();
  //Vector<Number>v1=v;  ¿ù»~
  //Vector<Object>v1=v;  ¿ù»~
  //List<Number>v1=v;    ¿ù»~
  Vector v1=v;
 }
}