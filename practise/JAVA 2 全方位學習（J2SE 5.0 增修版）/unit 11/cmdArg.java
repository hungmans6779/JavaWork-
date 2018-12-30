 class cmdArg
 {
  public static void main(String argv[])
  {
   System.out.println("You have input "+argv.length+" argument(s)");
   for (int i=0;i<argv.length;i++)
   {
    System.out.println("argument "+(i+1)+" : "+argv[i]);
   } 
 }
} 
 