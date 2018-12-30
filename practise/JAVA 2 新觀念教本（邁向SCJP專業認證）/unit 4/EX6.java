class EX6
{
 public static void main(String argv[])
 {
  int n;
  char f;
  n=Integer.parseInt(argv[0]);
  if(n>=90)
  { f='A';}
  else if(n>=80)
  { f='B'; }
  else if(n>=70)
  { f='C'; }
  else if(n>=60)
  { f='D'; }
  else
  { f='E';}
  System.out.println("您的分數 : "+n+"\t等第為 : "+f);
 }
}