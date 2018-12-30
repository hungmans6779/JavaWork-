public class TestEntry
{
	public static void main(String argv[])
	{
	 int i=100;
	 i=((i++>>35)<<32)%10;
	  System.out.println("i="+i);
		 //int a=-1;a=a>>>5;
	 //int b=-1;b=b>>>32;
	 //byte c=-1;c=c>>>5;
	 //int d=-1;d=d>>5;
	 //System.out.println("a="+a);	
	 //System.out.println("b="+b);	
	 //System.out.println("c="+c);
	 //System.out.println("d="+d);		
	}
}