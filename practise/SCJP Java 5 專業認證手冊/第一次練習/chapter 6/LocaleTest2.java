import java.util.*;
public class LocaleTest2
{
 public static void main(String argv[])
 {
  Locale locBR=new Locale("pt","BR"); //�ڦ�
  Locale locDK=new Locale("da","DK"); //����
  Locale locIT=new Locale("it","IT"); //�q�j�Q
  System.out.println("�ڦ�language : "+locBR.getDisplayLanguage());
  System.out.println("�ڦ�language : "+locBR.getDisplayLanguage(locBR));
  System.out.println("�ڦ�language : "+locBR.getDisplayLanguage(locDK));
  System.out.println("�ڦ�language : "+locBR.getDisplayLanguage(locIT));
  System.out.println("�ڦ�countuage : "+locBR.getDisplayCountry());
  System.out.println("�ڦ�countuage : "+locBR.getDisplayCountry(locBR));
  System.out.println("�ڦ�countuage : "+locBR.getDisplayCountry(locDK));
  System.out.println("�ڦ�countuage : "+locBR.getDisplayCountry(locIT));
  System.out.println("=============================================");
  System.out.println("����language : "+locDK.getDisplayLanguage());
  System.out.println("����language : "+locDK.getDisplayLanguage(locDK));
  System.out.println("����language : "+locDK.getDisplayLanguage(locBR));
  System.out.println("����language : "+locDK.getDisplayLanguage(locIT));
  System.out.println("����country : "+locDK.getDisplayCountry());
  System.out.println("����country : "+locDK.getDisplayCountry(locDK));
  System.out.println("����country : "+locDK.getDisplayCountry(locBR));
  System.out.println("����country : "+locDK.getDisplayCountry(locIT));
  System.out.println("=============================================");
  
  
  
 }
} 
  

 