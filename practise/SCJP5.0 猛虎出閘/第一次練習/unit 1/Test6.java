class Test6
{
 public static void main(String argv[])
 {
 	int i1[]=new int[]{1,2,3};
 	for(int k:i1)
 	System.out.print(k+",");
 	System.out.println();
 	int i2[][]=new int[2][];
 	i2[0]=new int[]{1,2,3,4};
 	i2[1]=new int[]{5,6,7};
 	for(int k1[]:i2)
 	 for(int k2:k1)
 	  System.out.println(k2+",");
 	  
 	String [][][]s=new String[][][]{{{"J","a"},{"v","a"}},{{" S","C"},{"J","P"}}};
 	for(String s1[][]:s)
 	 for(String s2[]:s1)
 	  for(String s3:s2)
 	   System.out.print(s3);  
 	
 	int [][]i3=new int[1][];
 }
}	