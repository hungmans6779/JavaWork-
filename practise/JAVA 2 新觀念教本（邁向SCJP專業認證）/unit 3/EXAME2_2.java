class EXAME2_2
{
 public static void main(String argv[])
 {
  int i=2;
  if(i==(i>>>28))
  { System.out.println("int 為 28bits"); }
  else if(i==(i>>>29))
  { System.out.println("int 為 29bits"); }
  else if(i==(i>>>30))
  { System.out.println("int 為 30bits"); }
  else if(i==(i>>>31))
  { System.out.println("int 為 31bits"); }
  else if(i==(i>>>32))
  { System.out.println("int 為 32bits"); }
  else if(i==(i>>>33))
  { System.out.println("int 為 33bits"); }
  else if(i==(i>>>34))
  { System.out.println("int 為 34bits"); }
  else
  {
   System.out.println("找不出結果呀");
  }
 }
}