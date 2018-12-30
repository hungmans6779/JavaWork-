public class EXAME5_04_1
{
 public static void main(String argv[])
 {
  String s="-";
  try
  {
  	doMath(argv[0]);
  	//doMath("0");
  	s+="t";
  }
  catch(Exception ie)
  {
   System.out.println("我捕捉到例外了");
   ie.printStackTrace();
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