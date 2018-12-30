import java.util.*;
public class EX3_2
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("�п�J�@�B�⦡");
   return;
  }
  try
  {
   List s=new Stack();
   for(int i=0;i<argv[0].length();i++)
   {
    char ch=argv[0].charAt(i);
    if(ch=='(')
    {
     ((Stack)s).push("(");
    }
    else if(ch==')')
    {
     ((Stack)s).pop();
    }
   }
   if(((Stack)s).empty())
   {
    System.out.println("���c���T");	
   }	
   else
   {
    throw new EmptyStackException();	
   }
  }
  catch(EmptyStackException e)
  {
   System.out.println("���c���~");	
  }	 	
 }
}