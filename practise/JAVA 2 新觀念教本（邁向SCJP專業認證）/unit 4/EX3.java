class EX3
{
 public static void main(String argv[])
 {
  //int i=Integer.parseInt(argv[0]);
  int i=Integer.valueOf(argv[0]).intValue();
  System.out.println("�ҶǤJ���Ȭ� : "+i);
  if(i%2==0)
  {
   System.out.println("�O����.....");	
  }	
  if(i%2==1)
  {
   System.out.println("�O�_��.....");	
  }	
 }
}