class LinkTest1
{
 int i;
 LinkTest1 ex;
 public static void main(String argv[])
 {
  LinkTest1 obj=new LinkTest1();
  obj.ex=new LinkTest1();
  obj.ex.i=1;
  obj.ex.ex=new LinkTest1();
  obj.ex.ex.i=2;
  System.out.println(obj.i);
  System.out.println(obj.ex.i);
  System.out.println(obj.ex.ex.i);
 }
}