class Test9
{
 public static void main(String argv[])
 {
  String s1[]={"Java ","SCJP"};
  amethod(s1);
  new Test9().bmethod(s1);
 }
 public static void amethod(String[] o)
 {
 	for(String s:o)
 	 System.out.print(s);
 }	
 public void bmethod(String[] o)
 {
 	System.out.println();
 	for(String s:o)
 	 System.out.print(s);
 }	
}	