class EXAME2_1
{
 public static void main(String argv[])
 {
  int num[]=new int[3];
  int max;
  num[0]=Integer.parseInt(argv[0]);
  num[1]=Integer.parseInt(argv[1]);
  num[2]=Integer.parseInt(argv[2]);
  max=num[0];
  for(int i=1;i<3;i++)
  {
   if(num[i]>max)
    max=num[i];	
  }	
  System.out.println("³Ì¤j­È¬° : "+max);
 }
}