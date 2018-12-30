class EX10_1
{
 public static void main(String argv[])
 {
 	int ori[]={5,2,0,7,8,9};
 	int dup[];
 	int other[]=new int[ori.length];
 	System.arraycopy(ori,0,other,0,ori.length);
 	dup=duplicateArray(ori);
 	System.out.println("ori : "+ori);
 	showArray(ori);
 	System.out.println("dup : "+dup);
 	showArray(dup);
 	System.out.println("other : "+other);
 	showArray(other);
 }		
 public static int[] duplicateArray(int a[])
 {
 	int b[]=new int[a.length];
  for	(int i=0;i<a.length;i++)
  {
   b[i]=a[i];	
  }	
 	return b;
 }	
 static void showArray(int a[])
 {
 	for(int i:a)
 	{
 	 System.out.print(i+"\t");	
 	}	
 	System.out.println();
 }	
}