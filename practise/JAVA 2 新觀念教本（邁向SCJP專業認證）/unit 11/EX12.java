public class EX12
{
 static MyObj myobj;
 public static void main(String argv[])
 {
  for(int i=0;i<99;i++)
  {
   System.gc();
   //Runtime.getRuntime().gc();
   myobj=new MyObj("���j "+i+" ��");
   
   myobj=null;
  }
 }
}

class MyObj
{
 private String name;
 MyObj(String name)
 {
 	System.out.println(name+" �Q�إߤF");
  this.name=name;
 }
 protected void finalize()
 {
  System.out.println(name+" �Q�^���F");
 }
}