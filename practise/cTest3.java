public class cTest3
{
 public static void main(String argv[])
 {
  Byte b1=new Byte((byte)123);
  Byte b2=new Byte("122");
  //-------------------------------------------------------------------------------------
  // �d��1�G���b1 �� b2 �Ȫ��j�p
  // ��k 1
    System.out.println("================================================");
  if(b1.intValue()>b2.intValue())
   System.out.println("b1="+b1+","+"b2="+b2+" ������G b1>b2");
  else if(b1.intValue()<b2.intValue())
   System.out.println("b1="+b1+","+"b2="+b2+" ������G b1<b2");
  else
   System.out.println("b1="+b1+","+"b2="+b2+" ������G b1=b2");
  
  // ��k2 
  System.out.println(b1.compareTo(b2)>=0?"b1>=b2":"b1<b2");
  //-------------------------------------------------------------------------------------
  // �d��2�G���b1��b2�O�_�۵�
  System.out.println("================================================");
  //System.out.println("b1==b2"+(b1==b2));  //���~���P�_�覡
  System.out.println("b1==b2?"+b1.equals(b2)+" ��hashCode �Ȭ� b1="+b1.hashCode()+",b2="+b2.hashCode());
 }
}