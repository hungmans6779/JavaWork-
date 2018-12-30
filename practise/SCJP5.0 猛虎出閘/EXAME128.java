class ClassA
{
 public int numberOfInstances;
 protected ClassA(int numberOfInstance)
 {
  this.numberOfInstances=numberOfInstance;
 }
}

public class EXAME128 extends ClassA
{
 private EXAME128(int numberOfInstance)
 {
  super(numberOfInstance);	
 }	
 public static void main(String argv[])
 {
  EXAME128 exame128=new EXAME128(420);
  System.out.println("numberOfInstance = "+exame128.numberOfInstances);
 }
}