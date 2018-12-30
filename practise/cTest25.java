public class cTest25
{
 public static String numberTOString(int number)
 {
  String str=String.valueOf(number);
  return	str;
 }
 public static int StringToNumber(String numStr)
 {
 	int temp=0;
 	int number=0;
 	for(int i=0;i<numStr.length();i++)
 	{
 	 temp=numStr.charAt(i)-48;
 	 if(temp<0 || temp >9)
 	  return 0;
 	  temp=temp*((int)Math.pow(10,numStr.length()-1-i));		
 	  number+=temp;
 	}	
 	return number;
 }			
 public static void main(String argv[])
 {
  System.out.println(cTest25.StringToNumber("123"));	
 }	
}	