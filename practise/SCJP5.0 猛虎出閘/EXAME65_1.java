import java.util.*;
public class EXAME65_1
{
 String s;
 public EXAME65_1(String s)
 {
  this.s=s;
 }
 
 public boolean equals(Object o)
 {
 	if((o instanceof EXAME65_1) && (((EXAME65_1)o).s==this.s))
 	{
 	 //System.out.println("我被執行到了");	
 	 return true;	
 	}	
 	else
 	{
 	 //System.out.println("我被執行到了");
 	 return false;
 	}	
 }
 public int  hashCode()
 {
 	return s.length();
 }		
 
 public static void main(String argv[])
 {
  EXAME65_1 ex1=new EXAME65_1("ex1");
  EXAME65_1 ex2=new EXAME65_1("ex1");
  String str1=new String("str1");
  String str2=new String("str1");
  HashSet<Object> hash=new HashSet<Object>();
  hash.add(ex1);
  hash.add(ex2);
  hash.add(str1);
  hash.add(str2);
  //System.out.println(
  System.out.println("size = "+hash.size());
 }
}