public class Character1
{
 public static void main(String argv[])
 {
  Character c1=new Character('1');
  Character c2=new Character('1');
  Character c3=new Character('2');
  System.out.println(c1.equals(c2));
  System.out.println(c1.equals(c3));
  System.out.println(c1.compareTo(c2));
  System.out.println(c1.compareTo(c3));
  System.out.println(c3.compareTo(c2));
  
  char c=Character.valueOf('3').charValue();
  System.out.println(c);
 }
}