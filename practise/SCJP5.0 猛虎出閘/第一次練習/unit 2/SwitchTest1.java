class SwitchTest1
{
 public static void main(String argv[])
 {
  char value='c';
  switch(value)
  {
   case 'a':
    System.out.println(1);
   case 'b':
    System.out.println(2);
    break;
   case 'c':
    System.out.println(3);
    break;
   default:
    System.out.println("default");
   break;
  }
 }
}