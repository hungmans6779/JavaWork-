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
  System.out.println("��k�� a:"+a);
  System.out.println("��k�� this.a:"+this.a);
  {
   {
    int b=2;
    System.out.println("�_���ϰ줺 b:"+b);
    System.out.println("�_���ϸ��� this.b:"+this.b);
   }
   System.out.println("�϶��� b:"+b);
   System.out.println("�϶��� this.b:"+this.b);
  }
 }
 int b=20;
}