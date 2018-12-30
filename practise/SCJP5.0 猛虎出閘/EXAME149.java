interface A
{ 
 void x();
}

class B implements A
{
 public void x(){}
 public void y(){}
}

class C extends B
{
 public void x(){}
}

public class EXAME149
{
 public static void main(String argv[])
 {
  java.util.List<A>list=new java.util.ArrayList<A>();
  list.add(new B());
  list.add(new C());
  for(A a:list)
  {
  	a.x();
  	//a.y(); //½sÄ¶¿ù»~
  }		
 } 
}	