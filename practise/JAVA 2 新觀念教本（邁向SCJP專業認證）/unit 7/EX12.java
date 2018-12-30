class EX12
{
 int a=10;
 public static void main(String argv[])
 {
  EX12 obj=new EX12();
  obj.myMethod(1);
 }
 void myMethod(int a)
 {
  System.out.println("方法內 a:"+a);
  System.out.println("方法內 this.a:"+this.a);
  {
   {
    int b=2;
    System.out.println("巢狀區域內 b:"+b);
    System.out.println("巢狀區載內 this.b:"+this.b);
   }
   System.out.println("區塊內 b:"+b);
   System.out.println("區塊內 this.b:"+this.b);
  }
 }
 int b=20;
}