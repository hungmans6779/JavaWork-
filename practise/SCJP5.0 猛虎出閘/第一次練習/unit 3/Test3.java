class Test3
{
 public static void main(String argv[])
 {
  new Test3().amethod(2,"Java");
 }
 void amethod(String str,int i)
 {
  System.out.println(str+i);	
 }
 void amethod(int i,String str)
 {
 	System.out.println(i+str);
 }	
}