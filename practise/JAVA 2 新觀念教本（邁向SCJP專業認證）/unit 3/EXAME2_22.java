class EXAME2_22
{
 public static void main(String argv[])
 {
  long i=2l;
  int count=1;
  while(true)
  {
   if(i==(i>>count))
   {
    System.out.println("long ��bit�ƬO : "+count);
    break;
   }
   count++;
  }
 }
}