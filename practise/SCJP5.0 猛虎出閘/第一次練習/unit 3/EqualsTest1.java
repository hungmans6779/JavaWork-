class EqualsTest1
{
  static String str1=new String("Java");
  static String str2=new String("Java");
  static String str3=new String("JAVA");
  static String str4=new String("Java1");
  static String str5="Java";
  static String str6="Java";
  static String str7="JAVA";
  static String str8="Java1";

 public static void main(String argv[])
 {
 	System.out.println("測試String產生的物件之比較");
  System.out.println("str1 == str2 : "+(str1==str2));
  System.out.println("str1 == str3 : "+(str1==str3));
  System.out.println("str1 == str4 : "+(str1==str4));
  System.out.println("str1.equals(str2) : "+str1.equals(str2));
  System.out.println("str1.equals(str3) : "+str1.equals(str3));
  System.out.println("str1.equalsIgnoreCase(str3) : "+str1.equalsIgnoreCase(str3));
  System.out.println("str1.equals(str4) : "+str1.equals(str4));
  System.out.println("\n=========================================");
  System.out.println("測試String的字串池之比較");
  System.out.println("str5 == str6 : "+(str5==str6));
  System.out.println("str5 == str7 : "+(str5==str7));
  System.out.println("str5 == str8 : "+(str5==str8));
  System.out.println("\n=========================================");
  System.out.println("測試String產生的物件與String的字串池之比較");
  System.out.println("str1 == str5 : "+(str1==str5));
  System.out.println("str1 == str7 : "+(str1==str7));
  System.out.println("str3 == str7 : "+(str3==str7));
  System.out.println("str4 == str8 : "+(str4==str8));
  System.out.println("str1.equals(str5) : "+str1.equals(str5));
  System.out.println("str1.equals(str7) : "+str1.equals(str7));
  System.out.println("str1.equalsIgnoreCase(str7) : "+str1.equalsIgnoreCase(str7));
  System.out.println("str1.equals(str8) : "+str1.equals(str8));
  System.out.println("str4.equals(str8) : "+str4.equals(str8));
 }
}