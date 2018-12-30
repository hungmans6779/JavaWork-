class Test1
{
 static int j=0;
 static int z=0;	
 public static void main(String argv[])
 {
 	System.out.println("ด๚ธี");
 	new Test1().amethod(3);
 	bmethod(2);
 	System.out.println("j = "+j);
 	System.out.println("z = "+z);
 }		

 void amethod(int j)
 {
 	j=1;
 	System.out.println("j = "+j);
 }	
 public static void bmethod(int z)
 {
 	int i=1;
 	z=z+i;
 	System.out.println("z = "+z);
 }	
}	