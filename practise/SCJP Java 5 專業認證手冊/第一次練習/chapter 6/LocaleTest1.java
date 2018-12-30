import java.util.*;
import java.text.*;
public class LocaleTest1
{
 public static void main(String argv[])
 {
  Calendar c=Calendar.getInstance();
  c.set(2010,11,14);
  Date now=c.getTime();
  System.out.println("2010�~12��14�骺�ɶ��� : "+now);
  Locale locIT=new Locale("it","IT"); //�q�j�Q
  Locale locPT=new Locale("pt");      //�����
  Locale locBR=new Locale("pt","BR"); //�ڦ�
  Locale locIN=new Locale("hi","IN"); //�L��
  Locale locJA=new Locale("ja");      //�饻
  Locale locTW=new Locale("zh","TW"); //�x�W
  DateFormat dus=DateFormat.getInstance();
  System.out.println("�����w�a�� : "+dus.format(now));
  DateFormat dusfull=DateFormat.getDateInstance(DateFormat.FULL);
  System.out.println("�����w�a�� : "+dusfull.format(now));
  DateFormat dfit=DateFormat.getDateInstance(DateFormat.FULL,locIT);
  System.out.println("�q�j�Q��� : "+dfit.format(now));
  DateFormat dfpt=DateFormat.getDateInstance(DateFormat.FULL,locPT);
  System.out.println("�������� : "+dfpt.format(now));
  DateFormat dfbr=DateFormat.getDateInstance(DateFormat.FULL,locBR);
  System.out.println("�ڦ��� : "+dfbr.format(now));
  DateFormat dfin=DateFormat.getDateInstance(DateFormat.FULL,locIN);
  System.out.println("�L�ת�� : "+dfin.format(now));
  DateFormat dfja=DateFormat.getDateInstance(DateFormat.FULL,locJA);
  System.out.println("�饻��� : "+dfja.format(now));
  DateFormat dftw=DateFormat.getDateInstance(DateFormat.FULL,locTW);
  System.out.println("�x�W��� : "+dftw.format(now));
 
 }
}