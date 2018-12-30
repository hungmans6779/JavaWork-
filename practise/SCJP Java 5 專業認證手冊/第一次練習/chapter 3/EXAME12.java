public class EXAME12
{
 public static void main(String argv[])
 {
 	EXAME12 e1=new EXAME12();
 	EXAME12 e2=new EXAME12();
 	EXAME12 e3=new EXAME12();
 	e3.e=e2;
 	e1.e=e3;
 	e2=null;
 	e3=null;
 	e2.e=e1; 
 	e1=null;
 }
 EXAME12 e;	
}