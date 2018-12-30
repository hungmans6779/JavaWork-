class StringTest2
{
 public static void main(String argv[])
 {
  String s1[]={"Java","SCJP"};
  amethod(s1);
  System.out.println();
  bmethod(s1);
 }
 public static void amethod(String o[])
 {
 	//System.out.println(o);
 	for(String s:o)
 	{
 	 System.out.print(s+"\t");	
  }
 }	
 public static void bmethod(String ... o)
 {
 	for(String s:o)
 	{
 	 System.out.print(s+"\t");	
 	}	
 }	
}