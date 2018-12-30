interface InterfaceTest1
{
 public static final String str="cute";
 public abstract void skill();
 public abstract void show(); 
}

public class InterfaceTest2
{
 public static void main(String argv[])
 {	
	InterfaceTest1 t1=new InterfaceTest1()
	{
	 public void skill()
	 {
	 	System.out.println("我會握手");
	 }	
	 public void show()
	 {
	 	System.out.println("我會唱歌");
	 }	
	};
	t1.skill();
	t1.show();
	System.out.println(t1.str);
 }	
}	