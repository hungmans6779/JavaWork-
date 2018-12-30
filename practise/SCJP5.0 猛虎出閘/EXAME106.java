public class EXAME106
{
 private String name,comment;
 private int age;
 public EXAME106(String n,int a,String c)
 {
  name=n;
  age=a;
  comment=c;
 }
 public boolean equals(Object o)
 {
  if(!(o instanceof EXAME106)) return false;
  EXAME106 p=(EXAME106)o;
  return age==p.age && name.equals(p.name);	
 }	
 public int hashCode()
 {
  return name.hashCode()+age*7;	
 }
 public static void main(String argv[])
 {
 	EXAME106 e1=new EXAME106("Dog",1,"Marry");
 	EXAME106 e2=new EXAME106("Dog",1,"Marry");
 	EXAME106 e3=new EXAME106("Animal",1,"Jackyy");
 	System.out.println("e1.equals(e2) = "+e1.equals(e2));
 	System.out.println("e1.equals(e3) = "+e1.equals(e3));
 	System.out.println("e2.equals(e3) = "+e2.equals(e3));
 	System.out.println("e1.hashCode() = "+e1.hashCode());
 	System.out.println("e2.hashCode() = "+e2.hashCode());
 	System.out.println("e3.hashCode() = "+e3.hashCode());
 }	
}