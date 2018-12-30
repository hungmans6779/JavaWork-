import java.util.*;
public class EXAME16
{
 public static void main(String argv[])
 {
  /*編譯失敗
  ArrayList<Integer>input=null;
  ArrayList<Integer>output=null;	
  */
  
  /*編譯成功 
  ArrayList<Integer>input=null;
  List<Integer>output=null; 
  */ 
  
  /*編譯失敗 
  ArrayList<Integer>input=null;
  List<Number>output=null;
  */
  
  /*編譯成功
  List<Number>input=null;
  List<Number>output=null;
  */
  
  //編譯成功
  List<Integer>input=null;
  List<Integer>output=null;
   
  output=process(input);
 }
  public static <E extends Number> List<E> process(List<E> nums)
  {
  	return new ArrayList();
  }
 
}