class EX2
{
 public static void main(String argv[])
 {
  int i,j;
  i=6;
  j=++i;
  System.out.println("j=++i  j="+j+" i="+i);
    
  i=6;
  j=i++;
  System.out.println("j=i++  j="+j+" i="+i); 
  
  i=6;
  j=--i;
  System.out.println("j=--i  j="+j+" i="+i);
  
  i=6;
  j=i--;
  System.out.println("j=i--  j="+j+" i="+i);
 }
}