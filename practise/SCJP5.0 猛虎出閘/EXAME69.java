import java.util.*;
class A {}
class B extends A {}
public class EXAME69
{
 public static void main(String argv[])
 {
  List<A> listA=new LinkedList<A>();
  List<B> listB=new LinkedList<B>();
  List<Object>listO=new LinkedList<Object>();
  m1(listA);
 }
 public static void m1(List<? extends A>list){}
 public static void m2(List<A>list){}
}