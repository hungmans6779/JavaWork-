class EX8
{
 public static void main(String argv[])
 {
   	int num[]={11,16,21,25,28,32,35,36,42,49,56,68,69,76,81,97};
  if(argv.length<1)
  {
   System.out.println("�п�J���j�M���Ʀr");
   for(int i=0;i<num.length;i++)
   {
    System.out.print(num[i]+"\t");
   }
  }
  
  int search=Integer.parseInt(argv[0]);
  for(int i=0;i<num.length;i++)
  {
   System.out.print(num[i]+"\t");
  }
  System.out.println();
  for(int i=0;i<num.length;i++)
  {
   if(search==num[i])
   {
   	System.out.print("�w�g���F");
   	System.out.println("\n�@���F "+(i+1)+" ��");
   	System.exit(0);
   }		
   else
   {
   	System.out.print("*\t");
   }	
  }	
  System.out.println("\n��p�I�䤣��.........");
 }
}