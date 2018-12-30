import java.util.*;
import java.text.*;
public class LocaleTest1
{
 public static void main(String argv[])
 {
  Calendar c=Calendar.getInstance();
  c.set(2010,11,14);
  Date now=c.getTime();
  System.out.println("2010年12月14日的時間為 : "+now);
  Locale locIT=new Locale("it","IT"); //義大利
  Locale locPT=new Locale("pt");      //葡萄牙
  Locale locBR=new Locale("pt","BR"); //巴西
  Locale locIN=new Locale("hi","IN"); //印度
  Locale locJA=new Locale("ja");      //日本
  Locale locTW=new Locale("zh","TW"); //台灣
  DateFormat dus=DateFormat.getInstance();
  System.out.println("未指定地域 : "+dus.format(now));
  DateFormat dusfull=DateFormat.getDateInstance(DateFormat.FULL);
  System.out.println("未指定地域 : "+dusfull.format(now));
  DateFormat dfit=DateFormat.getDateInstance(DateFormat.FULL,locIT);
  System.out.println("義大利表示 : "+dfit.format(now));
  DateFormat dfpt=DateFormat.getDateInstance(DateFormat.FULL,locPT);
  System.out.println("葡萄牙表示 : "+dfpt.format(now));
  DateFormat dfbr=DateFormat.getDateInstance(DateFormat.FULL,locBR);
  System.out.println("巴西表示 : "+dfbr.format(now));
  DateFormat dfin=DateFormat.getDateInstance(DateFormat.FULL,locIN);
  System.out.println("印度表示 : "+dfin.format(now));
  DateFormat dfja=DateFormat.getDateInstance(DateFormat.FULL,locJA);
  System.out.println("日本表示 : "+dfja.format(now));
  DateFormat dftw=DateFormat.getDateInstance(DateFormat.FULL,locTW);
  System.out.println("台灣表示 : "+dftw.format(now));
 
 }
}