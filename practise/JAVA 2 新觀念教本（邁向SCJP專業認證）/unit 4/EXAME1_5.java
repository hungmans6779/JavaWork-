class EXAME1_5
{
 public static void main(String argv[])
 {
  int i=3,c=0;
  float f=3.0;
  double d=1.9;
  if(i==f)c++;
  if((int)(f+d)==(int)f+(int)d)c++;
  System.out.println(c);
 }
}