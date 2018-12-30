public class IsolatingAReferenceTest1
{
 IsolatingAReferenceTest1 i;	
 public static void main(String argv[])
 {
  IsolatingAReferenceTest1 i2=new IsolatingAReferenceTest1();
  IsolatingAReferenceTest1 i3=new IsolatingAReferenceTest1();
  IsolatingAReferenceTest1 i4=new IsolatingAReferenceTest1();
  i2.i=i3;
  i3.i=i4;
  i4.i=i2;
 }
}