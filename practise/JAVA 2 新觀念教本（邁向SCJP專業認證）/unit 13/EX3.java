import java.util.*;
public class EX3
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("請輸入一運算式");
   return;
  }
  try
  {
   Stack s=new Stack();
   for(int i=0;i<argv[0].length();i++)
   {
    char ch=argv[0].charAt(i);
    if(ch=='(')
    {
     s.push("(");
    }
    else if(ch==')')
    {
     s.pop();
    }
   }
   if(s.empty())
   {
    System.out.println("結構正確");	
   }	
   else
   {
    throw new EmptyStackException();	
   }
  }
  catch(EmptyStackException e)
  {
   System.out.println("結構錯誤");	
  }	 	
 }
}