public class EX1
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("請輸入一整數參數！！！");
   return;
  }
  
  int g=1;
  Long n=Long.parseLong(argv[0]);
  if(Byte.MIN_VALUE<=n && Byte.MAX_VALUE>=n)
  { g=1; }	
  else if(Short.MIN_VALUE<=n && Short.MAX_VALUE>=n)
  { g=2; }	
  else if(Integer.MIN_VALUE<=n && Integer.MAX_VALUE>=n)
  { g=3; }	
  else if(Long.MIN_VALUE<=n && Long.MAX_VALUE>=n)
  { g=4; }	
  switch(g)
  {
    case 1:
     System.out.println("可以為byte 型別");
    case 2:
     System.out.println("可以為short 型別"); 
    case 3:
     System.out.println("可以為int 型別");
    case 4:
     System.out.println("可以為long 型別");
  }	
 }
}