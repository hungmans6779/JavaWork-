class EX8
{
 public static void main(String argv[])
 {
  int grade=Integer.parseInt(argv[0]);
  char f;
  switch(grade/10)
  {
   default: 
    f='F'; 
    break;
   case 10:
   case 9:
    f='A';
    break;
   case 8:
    f='B';
    break;
   case 7:
    f='c';
    break;
   case 6:
    f='D';
    break; 
  }
  System.out.println("您的等第為 : "+f);
 }
}