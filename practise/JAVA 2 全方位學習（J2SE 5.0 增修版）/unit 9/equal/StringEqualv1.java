public class StringEqualv1
{
 public static void main(String argv[])
 {
 // String str1=new String("Hello"); 
 // String str2=new String("Hello"); 
 // String str3=new String("Java"); 
 // String str4=str1; 
 
  //String str1="Hello";
  //String str2="Hello";
  //String str3="Java";
  //String str4=str1;
  
  
  String str[]=new String[3];
  str[0]="Hello";
  str[1]="Hello";
  str[2]="Java";
  System.out.println("str length = "+str.length);
 
 
   System.out.println(str[0]==str[1]);
   System.out.println(str[0]==str[2]);
  
 // System.out.println(str1==str2);
 // System.out.println(str1==str3);
 // System.out.println(str1==str4);
 }
}