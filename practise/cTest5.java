public class cTest5
{
 public static void main(String argv[])
 {
 	/*
  String str="Hello Java";
  System.out.println("=========================================");
  //�N�r���ഫ��byte���Ȧs�Jbyte[]�}�C��
  byte b[]=new byte[str.length()];
  b=str.getBytes();
  for(byte value:b)
  System.out.print(value+",");
  String newStr=new String(b,0,5);
  System.out.println("\n"+newStr);
  System.out.println("=========================================");
  //���N�r�ꤤ���Y�@�r��
  System.out.println(str.replace('a','D'));
  System.out.println("=========================================");
  //�ഫ�j�p�g
  String upperStr=str.toUpperCase();
  System.out.println("upperStr="+upperStr);
  String lowerStr=str.toLowerCase();
  System.out.println("lowerStr="+lowerStr);
  String noSpace=str.trim();
  System.out.println("nospace ="+noSpace);
  System.out.println("=========================================");
  //Ū���r�ꤤ���C�@�r���Φr���X
  for(int i=0;i<str.length();i++)
   System.out.print(str.charAt(i)+",");
  System.out.println();
  for(int i=0;i<str.length();i++)
   System.out.print(str.codePointAt(i)+",");
  System.out.println();	
  System.out.println("=========================================");
  System.out.println(str.codePointBefore(2));
  System.out.println(str.codePointCount(0,4));
  String str1=new String("C");
  String str2=new String("c");
  System.out.println(str1.compareTo(str2));
  System.out.println(str1.compareToIgnoreCase(str2));
  System.out.println("=========================================");
  //concat��contains
  System.out.println(str.concat(" 1.5"));
  System.out.println("str�O�_�]�tello���r��:"+str.contains("ello"));
  System.out.println("=========================================");
  */
  //contentEquals��equals���Ϊk
  String stt1=new String("Java");
  String stt2=new String("JAVA");
  String stt3=new String("Java");
  StringBuffer sb=new StringBuffer("Java");
  System.out.println(stt1.equals(stt2));
  System.out.println(stt1.equals(stt3));
  System.out.println(stt1.equals(sb));
  System.out.println(stt1.contentEquals(sb));
  System.out.println("=========================================");
  /*
  System.out.println(str);
  System.out.println("01234567890");
  System.out.println(str.indexOf('a'));
  System.out.println(str.indexOf('a',8));
  System.out.println(str.indexOf("av"));
  System.out.println(str.indexOf("av",8));
  System.out.println(str.lastIndexOf('a'));
  System.out.println(str.lastIndexOf("av"));
  System.out.println(str.lastIndexOf('a',8)); 
  System.out.println(str.lastIndexOf("av",8));
  System.out.println("=========================================");
  String str3="Java";
  System.out.println(str3.matches("\\w\\w\\w\\w"));
  System.out.println("=========================================");
  String str4="http://www.yahoo.com.tw";
  System.out.println(str4.endsWith("tw"));
  System.out.println(str4.startsWith("http"));
  System.out.println("=========================================");
  String str5="www.yahoo.com.tw";
  String bufferStr[]=str5.split("\\.");
  for(String value:bufferStr)
   System.out.print(value+",");
  System.out.println(); 
  System.out.println("=========================================");
  String str6="0123456789";
  System.out.println(str6.substring(2));
  System.out.println(str6.substring(2,5));
  */
 }
}