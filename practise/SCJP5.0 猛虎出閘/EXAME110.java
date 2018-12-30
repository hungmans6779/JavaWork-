public class EXAME110<T>
{
 private T object;
 public EXAME110(T object)
 {
  this.object=object;
 }
 public T getObject()
 {
  return object;
 }
 public static void main(String argv[])
 {
  EXAME110<String>str=new EXAME110<String>("µª®×");
  EXAME110<Integer>intg=new EXAME110<Integer>(42);
  System.out.println(str.getObject()+"="+intg.getObject());
 }

}