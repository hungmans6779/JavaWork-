class EX18
{
 public static void main(String argv[])
 {
  int value,n=2;
  boolean prime=true;
  value=Integer.parseInt(argv[0]);
  do
  {
   if((value%n==0)&&(value!=2))
   {
    prime=false;
    break;
   }  
   n++;
  }while(n<value);
  System.out.println(value+(prime?"是質數":"不是質數"));
 }
}