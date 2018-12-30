public class Test4
{
 String s;
 public Test4(String s)
 {
 	this.s=s;
 }		
 
 public boolean equals(Object o)
 {
  if((o instanceof Test4) && (((Test4)o).s==this.s))
  {
   return true;
  }	
  else
  {
   return false;	
  }	
 }
 public int hashCode()
 {
 	return s.length();
 }	
 
 public static void main(String argv[])
 {
 	Test4 t1=new Test4("test");
 	Test4 t2=new Test4("test");
 	System.out.println(t1.equals(t2));
 }	
}