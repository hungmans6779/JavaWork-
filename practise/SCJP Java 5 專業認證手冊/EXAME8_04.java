class Boo
{
 Boo(String s){}
 Boo(){}
}

public class EXAME8_04 extends Boo
{
 EXAME8_04(String s){super(s);}
 EXAME8_04(){}
 void zoo()
 {
 	//Boo f1=new Boo(24){}; //½sÄ¶¿ù»~
 	Boo f2=new EXAME8_04(){};
 	Boo f3=new EXAME8_04(){String s; };
  //EXAME8_04 f4=new EXAME8_04(String s){}; //½sÄ¶¿ù»~
 	// Boo f4=new Boo.EXAME8_04(String s){}; //½sÄ¶¿ù»~
 }	
 public static void main(String argv[])
 {
 	
 }	
}