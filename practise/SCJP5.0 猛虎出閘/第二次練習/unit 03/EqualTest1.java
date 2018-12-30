class Ball
{
 String tradeMark;
 String kind;
 String color;
 Ball(String t,String k,String c)
 {
  tradeMark=t;
  kind=k;
  color=c;
 }
}

public class EqualTest1
{
 public static void main(String argv[])
 {
  Ball b1=new Ball("´µ§B¤B","Äx²y","¬õ");
  Ball b2=new Ball("´µ§B¤B","Äx²y","¬õ");
  System.out.println("b1==b2:"+(b1==b2));
  System.out.println("b1.equals(b2) :"+(b1.equals(b2)));
 }
}