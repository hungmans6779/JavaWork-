class Alpha
{
 public void bar(int ... x){}
 public void bar(int x){}
}

public class EXAME45 extends Alpha
{
 //private void bar (int x){}
 public void bar(int x) {}
 public int bar(String x){ return 1;}
 //public Alpha bar(int x){}
 public void bar(int x,int y){}
 //public int bar(int x) {return x;}

}