class GCTest1
{
 public static void main(String argv[])
 {
 	new GCTest1();
 	new GCTest1();
 	new GCTest1();
 	new GCTest1();
  System.gc();
  Runtime.getRuntime().gc();
 }
}