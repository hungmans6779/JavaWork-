class EXAME2_21
{
 public static void main(String argv[])
 {
  int i=2;
  int count=1;
  while(true)
  {
   if(i==(i>>count))
   {
    System.out.println("int ��bit�ƬO : "+count+" bits");
    break;
   }
   count++;
  }
 }
}