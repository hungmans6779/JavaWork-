import java.util.*;
public class LocaleTest2
{
 public static void main(String argv[])
 {
  Locale locBR=new Locale("pt","BR"); //¤Ú¦è
  Locale locDK=new Locale("da","DK"); //¤¦³Á
  Locale locIT=new Locale("it","IT"); //¸q¤j§Q
  System.out.println("¤Ú¦èlanguage : "+locBR.getDisplayLanguage());
  System.out.println("¤Ú¦èlanguage : "+locBR.getDisplayLanguage(locBR));
  System.out.println("¤Ú¦èlanguage : "+locBR.getDisplayLanguage(locDK));
  System.out.println("¤Ú¦èlanguage : "+locBR.getDisplayLanguage(locIT));
  System.out.println("¤Ú¦ècountuage : "+locBR.getDisplayCountry());
  System.out.println("¤Ú¦ècountuage : "+locBR.getDisplayCountry(locBR));
  System.out.println("¤Ú¦ècountuage : "+locBR.getDisplayCountry(locDK));
  System.out.println("¤Ú¦ècountuage : "+locBR.getDisplayCountry(locIT));
  System.out.println("=============================================");
  System.out.println("¤¦³Álanguage : "+locDK.getDisplayLanguage());
  System.out.println("¤¦³Álanguage : "+locDK.getDisplayLanguage(locDK));
  System.out.println("¤¦³Álanguage : "+locDK.getDisplayLanguage(locBR));
  System.out.println("¤¦³Álanguage : "+locDK.getDisplayLanguage(locIT));
  System.out.println("¤¦³Ácountry : "+locDK.getDisplayCountry());
  System.out.println("¤¦³Ácountry : "+locDK.getDisplayCountry(locDK));
  System.out.println("¤¦³Ácountry : "+locDK.getDisplayCountry(locBR));
  System.out.println("¤¦³Ácountry : "+locDK.getDisplayCountry(locIT));
  System.out.println("=============================================");
  
  
  
 }
} 
  

 