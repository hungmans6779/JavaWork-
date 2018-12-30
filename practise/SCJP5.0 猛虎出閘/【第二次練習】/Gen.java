public class Gen<T>
{
 private T object;
 public Gen(T object)
 {
  this.object=object;	
 }	
 public  T getObject()
 {
 	return object;
 }	
 public static void main(String argv[])
 {
  Gen<String>str=new Gen<String>("[µª®×]");
  Gen<Integer>intg=new Gen<Integer>(42);
  System.out.println(str.getObject()+" = "+intg.getObject());
 }	
}