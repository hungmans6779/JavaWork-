public class Test3
{
 public static void main(String argv[])
 {
 	for(int count=0;count<100;count++)
 	{
   int i=(int)(Math.random()*6);
   System.out.println("i= "+i);
  } 
  String data=new String[]{"a","b","c","d"}[2];
  System.out.println("data= "+data);
 }
}