class Super
{
 String s="¤j¦Ï";
 void m()
 {
  System.out.println(s);
 }
}

class Sub extends Super
{
 String s="¤p¦Ï";
 void m()
 {
  System.out.println(s);
 }
}

public class EX1_7 
{
 public static void main(String argv[])
 {
  Super a=(Super)new Sub();
  System.out.println(a.s);
  a.m();
 }
}