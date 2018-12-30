import java.util.*;
public class LocaleTest2_1
{
 public static void main(String argv[])
 {
  Locale loc[]={new Locale("pt","BR"),new Locale("da","DK"),new Locale("it","IT")};
  for(int i=0;i<loc.length;i++)
  {
   for(int j=0;j<loc.length;j++)
   {	
    System.out.println("Language : "+loc[i].getDisplayLanguage(loc[j]));	
    System.out.println("Country : "+loc[i].getDisplayLanguage(loc[j]));	
   } 
   System.out.println("===========================================");
  }	
  
 }
}