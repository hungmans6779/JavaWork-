public class EX9
{
 public static void main(String argv[])
 {
  String str="東當舖 西當舖 東西當舖當東西";
  String sub="當舖";
  String ch1="東";
  String ch2="北";
  System.out.println(str);
  int loc=str.indexOf(ch1);
  while(loc!=-1)
  {
   showArror(loc,ch1+"");
   int i=loc+1;
   loc=str.indexOf(ch1,i);
  }
  showArror(str.indexOf(sub),sub);
  showArror(str.lastIndexOf(sub),"最後一個"+sub);
  showArror(str.indexOf(ch2),ch2+"");
 }
 static void showArror(int loc,String s)
 {
  if(loc==-1)
  {
   System.out.println("找不到:"+s);
   return;
  }
  for(int i=0;i<loc;i++)
  {
   System.out.print("  "); 
  }
  System.out.println("↑"+s+"位置為:"+loc);
 }
}