public class ReferenceTes21
{
 static int data=1;	
 public static void main(String argv[])
 {
  ReferenceTes21 rt=new ReferenceTes21();
  System.out.println("Before modify data="+data);
  rt.modify(data);
  System.out.println("After modify data="+data);
 }
 public void modify(int data)
 {
  data+=1;
  System.out.println("data="+data);	
 }	

}