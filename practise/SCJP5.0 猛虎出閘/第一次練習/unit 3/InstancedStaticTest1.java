class InstanceStaticTest1
{
 void amethod()
 {
  cmethod();
  bmethod();
 }
 void bmethod()
 {
 }
 static void cmethod()
 {
  dmethod();
 }
 static void dmethod()
 {
  new InstanceStaticTest1().amethod();
 }
 public static void main(String argv[])
 {
  	
 }
}