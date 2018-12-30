public class EX20
{
 public static void main(String argv[])
 {
  MyNum n[]={new MyNum(97),new MyNum(113),new MyNum(51)};
  for(int i=0;i<n.length;i++)
  {
   TestPri.showMsg(n[i]);
  }
 }
}

class TestPri
{
 public static void showMsg(MyNum n)
 {
  if(n.isPri())
  {
   System.out.println(n.getN()+" 是質數");
  }
  else
  {
   System.out.println(n.getN()+" 不是質數");
  }
 }
}


class MyNum
{
 private int n;
 MyNum(int n)
 {
  this.n=n;
 }
 public int getN()
 {
  return n;
 }
 
 public boolean isPri()
 {
  for(int i=2;i<n;i++)
   if(n%i==0)
    return false;
   return true; 
 } 
}