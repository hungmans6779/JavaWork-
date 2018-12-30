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
    System.out.println("int ªºbit¼Æ¬O : "+count+" bits");
    break;
   }
   count++;
  }
 }
}