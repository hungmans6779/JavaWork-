public class EXAME117
{
 static void aplha()
 {
 	System.out.println("�ڬOaplha����k");
 	new EXAME117().beta();
 }
 void beta()
 {
 	System.out.println("�ڬObeta����k");
  aplha();	
 }			
 public static void main(String argv[])
 {
  new EXAME117().beta();
 }
}