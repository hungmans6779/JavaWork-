public class EX1
{
 public static void main(String argv[])
 {
  if(argv.length<1)
  {
   System.out.println("�п�J�@��ưѼơI�I�I");
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
     System.out.println("�i�H��byte ���O");
    case 2:
     System.out.println("�i�H��short ���O"); 
    case 3:
     System.out.println("�i�H��int ���O");
    case 4:
     System.out.println("�i�H��long ���O");
  }	
 }
}