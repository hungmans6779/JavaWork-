class Father
{
 String name="Father";
 String geeting()
 {
  return "class Father";
 }
}
class PolymorphismSon extends Father
{
 String name="Son";
 String geeting()
 {
  return "class Son";
 }
 void foo()
 {
 	System.out.println(name);
 	System.out.println(geeting());
  System.out.println(this.name);
  System.out.println(((PolymorphismSon)this).name);
  System.out.println(((PolymorphismSon)this).geeting());
  System.out.println(((Father)this).name);
  System.out.println(this.geeting());
  System.out.println(((Father)this).geeting());
  System.out.println(super.name);
  System.out.println(super.geeting());
 
 }
 public static void main(String argv[])
 {
  new PolymorphismSon().foo();
 }
}
