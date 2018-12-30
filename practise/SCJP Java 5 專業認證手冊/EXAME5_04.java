public class EXAME5_04
{
 public static void main(String argv[])
 {
  String s="-";
  try
  {
  	//doMath(argv[0]);
  	doMath("0");
  	s+="t";
  }
  finally
  {
   System.out.println(s+="f "); 
  }
 } 		
 public static void doMath(String a)
 {
  int y=7/Integer.parseInt(a);	
 }	
} 