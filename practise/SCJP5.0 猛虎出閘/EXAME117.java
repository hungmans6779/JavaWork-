public class EXAME117
{
 static void aplha()
 {
 	System.out.println("我是aplha的方法");
 	new EXAME117().beta();
 }
 void beta()
 {
 	System.out.println("我是beta的方法");
  aplha();	
 }			
 public static void main(String argv[])
 {
  new EXAME117().beta();
 }
}