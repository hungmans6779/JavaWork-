import java.util.Date;
public class DateTest1
{
 public static void main(String argv[])
 {
  System.out.println("�{�b���ɶ����G "+new Date());
  System.out.println("��L�ªv���ɶ���: "+new Date(0));
  System.out.println("��L�ªv���ɶ��h1��: "+new Date(1000));
  System.out.println("��L�ªv���ɶ��h1�Ѭ�: "+new Date(1000*60*60*24));
  Date today=new Date();
  System.out.println("�줵�Ѭ���ɶ����G "+today.getTime()+" �@��");
  today.setTime(1000*60*60*24+today.getTime());
  System.out.println(today);
 }
}