public class Test4
{
 public void go()
 {
  doThing();
 }
 public void doThing()
 {
  go();
 }
 public static void main(String argv[])
 {
  new Test4().go();
 }
}