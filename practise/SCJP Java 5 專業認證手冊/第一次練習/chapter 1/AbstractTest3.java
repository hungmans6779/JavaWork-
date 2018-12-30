abstract class AbstractTest3
{
 abstract void get();
 public static void main(String argv[])
 {
  AbstractTest3 s3=new AbstractTest3()
  {
   void get()
   {
    System.out.println("AbstractTest3");
   }
  };
  s3.get();
 }
}