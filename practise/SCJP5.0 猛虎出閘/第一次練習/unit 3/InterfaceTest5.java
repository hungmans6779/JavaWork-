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
abstract class AbstractClass
{
 abstract void dd();	
}	
public class InterfaceTest5 extends AbstractClass implements Go,Run,Skill
{
 void dd()
  {
  System.out.println("test......");	
 }
 public void run()
  {
  System.out.println("test......");	
 }
 public void skill()
  {
  System.out.println("test......");	
 }
 public void go()
 {
  System.out.println("test......");	
 }	
}


