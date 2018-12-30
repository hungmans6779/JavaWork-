interface Foo{}
class Alpha implements Foo{}
class Beta extends Alpha{}
public class EXAME90 extends Beta
{
 public static void main(String argv[])
 {
  Beta x=new Beta();
  Alpha a=x;
  //Foo f=(EXAME90)x; //¿ù»~ ClassCastException 
  Foo f=(Alpha)x;
  Beta b=(Beta)(Alpha)x;
 }
}