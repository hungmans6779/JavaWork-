class EX10
{
 public static void main(String argv[])
 {
 	int ori[]={5,2,0,7,8,9};
 	int dup[];
 	dup=duplicateArray(ori);
 	System.out.println("ori : "+ori);
 	showArray(ori);
 	System.out.println("dup : "+dup);
 	showArray(dup);
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