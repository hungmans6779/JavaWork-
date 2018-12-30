class Bar
{
 int barNum=28;
}

public class ReferenceTest4
{
 Bar mybar=new Bar();
 public static void main(String argv[])
 {
  ReferenceTest4 r=new ReferenceTest4();
  System.out.println("Change Before barNum = "+r.mybar.barNum);
  r.changeIt(r.mybar);
  System.out.println("Change After barNum = "+r.mybar.barNum);
 }
 void changeIt(Bar mybar)
 {
  mybar.barNum=99;
  System.out.println("BeforebarNum="+mybar.barNum);
  mybar=new Bar();
  mybar.barNum=420;
  System.out.println("After barNum="+mybar.barNum);
 }	
}