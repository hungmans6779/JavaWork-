public class cTest3
{
 public static void main(String argv[])
 {
  Byte b1=new Byte((byte)123);
  Byte b2=new Byte("122");
  //-------------------------------------------------------------------------------------
  // 範例1：比較b1 及 b2 值的大小
  // 方法 1
    System.out.println("================================================");
  if(b1.intValue()>b2.intValue())
   System.out.println("b1="+b1+","+"b2="+b2+" 比較結果 b1>b2");
  else if(b1.intValue()<b2.intValue())
   System.out.println("b1="+b1+","+"b2="+b2+" 比較結果 b1<b2");
  else
   System.out.println("b1="+b1+","+"b2="+b2+" 比較結果 b1=b2");
  
  // 方法2 
  System.out.println(b1.compareTo(b2)>=0?"b1>=b2":"b1<b2");
  //-------------------------------------------------------------------------------------
  // 範例2：比較b1及b2是否相等
  System.out.println("================================================");
  //System.out.println("b1==b2"+(b1==b2));  //錯誤的判斷方式
  System.out.println("b1==b2?"+b1.equals(b2)+" 及hashCode 值為 b1="+b1.hashCode()+",b2="+b2.hashCode());
 }
}