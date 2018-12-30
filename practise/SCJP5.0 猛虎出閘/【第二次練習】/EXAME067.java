public class EXAME067
{
 public static void main(String argv[])
 {
  Object[]myObject={new Integer(12),new String("foo"),new Integer(5),new Boolean(true)};
  //Arrays.sort(myObject);
  for(int i=0;i<myObject.length;i++)
  {
   System.out.println(myObject[i].toString());
  } 
 }
}