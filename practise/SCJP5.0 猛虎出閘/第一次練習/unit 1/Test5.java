class Test5
{
 public static void main(String argv[])
 {
 	char c1='A';
 	char c2='A';
 	System.out.println("c1 == c2 = "+(c1==c2));
 	//System.out.println("c1.equals(c2) = "+(c1.equals(c2)));
 	System.out.println("\n�HString pool���覡");
 	String s1="Java";
 	String s2="Java";
 	System.out.println("s1==s2 = "+(s1==s2));
  System.out.println("s1.equals(s2) = "+(s1.equals(s2)));
  
  System.out.println("\n�Hnew ����String�����󤺮e");
 	String str1=new String("Java");
 	String str2=new String("Java");
 	System.out.println("str1 == str2 = "+(str1==str2));
 	System.out.println("str1.equals(str2) = "+(str1.equals(str2)));
 	
 	String s="Java ";
 	s+="SCJP";
 	System.out.println("\n"+s);
 }		
}	