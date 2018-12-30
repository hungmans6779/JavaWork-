class EX1 extends Exception{}
class EX2 extends EX1{}
public class EXAME1_6
{
 public static void main(String argv[])
 {
  String str="";
  int i=2;
  try
  {
   try
   {
    switch(i)
    {
     case 1: throw new EX1(); 
     case 2: throw new EX2(); 
     case 3: throw new Exception(); 
    }
    str+="a";
   }
   catch(EX2 e)
   {
    str+="b";
   }
   finally
   {
    if(i<3)
    {
     throw new Exception();
    }
    str+="c";
   }
  }
  catch(Exception e)
  {
   str+="d";
  }
  finally
  {
   str+="e";
  }
  System.out.println(str);
 }
}