public class LsoatingAReferenceTest1
{
 LsoatingAReferenceTest1 i;
 public static void main(String argv[])
 {
  LsoatingAReferenceTest1 i1=new LsoatingAReferenceTest1();
  LsoatingAReferenceTest1 i2=new LsoatingAReferenceTest1();
  LsoatingAReferenceTest1 i3=new LsoatingAReferenceTest1();
  i1.i=i2;
  i2.i=i3;
  i3.i=i1;
  i1=null;
  i2=null;
  i3=null;
 }
}