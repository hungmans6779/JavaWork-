interface Run
{
 void run();
}
interface Skill
{
 void skill();
}
interface Go
{
 void go();
}
interface InterfaceTest3 extends Run,Skill,Go
{ 
}

public class InterfaceTest4 implements InterfaceTest3
{
 public void run()
 {
 	System.out.println("�ڷ|Run");
 }	
 public void skill()
 {
 	System.out.println("�ڷ|Skill");
 }	
 public void go()
 {
 	System.out.println("�ڷ|Go");
 }		
 public static void main(String argv[])
 {
 	InterfaceTest4 t=new InterfaceTest4();
 	t.run();
 	t.go();
 	t.skill();
 }		
}	
