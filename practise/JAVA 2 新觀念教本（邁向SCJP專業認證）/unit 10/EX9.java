public class EX9
{
 public static void main(String argv[])
 {
  String str="�F���E ����E �F����E��F��";
  String sub="���E";
  String ch1="�F";
  String ch2="�_";
  System.out.println(str);
  int loc=str.indexOf(ch1);
  while(loc!=-1)
  {
   showArror(loc,ch1+"");
   int i=loc+1;
   loc=str.indexOf(ch1,i);
  }
  showArror(str.indexOf(sub),sub);
  showArror(str.lastIndexOf(sub),"�̫�@��"+sub);
  showArror(str.indexOf(ch2),ch2+"");
 }
 static void showArror(int loc,String s)
 {
  if(loc==-1)
  {
   System.out.println("�䤣��:"+s);
   return;
  }
  for(int i=0;i<loc;i++)
  {
   System.out.print("  "); 
  }
  System.out.println("��"+s+"��m��:"+loc);
 }
}