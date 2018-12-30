enum Color{red,green,blue}
public class Test48
{
 public static void main(String argv[])
 {
  Color c=Color.green;
  switch(c)
  {
   case red: System.out.println("red"); break;
   case green: System.out.println("green"); break;
   case blue: System.out.println("blue"); break;
   default: System.out.println("default"); break;	
  }	
 }
}