public class ReferenceTes2
{
 public static void main(String argv[])
 {
  int data=1;
  ReferenceTes2 rt=new ReferenceTes2();
  System.out.println("Before modify data="+data);
  rt.modify(data);
  System.out.println("After modify data="+data);
 }
 public void modify(int d)
 {
  d+=1;
  System.out.println("d="+d);	
 }	

}