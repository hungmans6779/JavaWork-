class Test5
{
 public static void main(String argv[])
 {
 	char c1='A';
 	char c2='A';
 	System.out.println("c1 == c2 = "+(c1==c2));
 	//System.out.println("c1.equals(c2) = "+(c1.equals(c2)));
 	System.out.println("\n以String pool的方式");
 	String s1="Java";
 	String s2="Java";
 	System.out.println("s1==s2 = "+(s1==s2));
  System.out.println("s1.equals(s2) = "+(s1.equals(s2)));
  
  System.out.println("\n以new 產生String的物件內容");
 	String str1=new String("Java");
 	String str2=new String("Java");
 	System.out.println("str1 == str2 = "+(str1==str2));
 	System.out.println("str1.equals(str2) = "+(str1.equals(str2)));
 	
 	String s="Java ";
 	s+="SCJP";
 	System.out.println("\n"+s);
 }		
}	