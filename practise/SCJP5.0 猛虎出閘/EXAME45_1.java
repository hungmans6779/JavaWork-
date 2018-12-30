class Alpha
{
 public void bar(int ... x){}
 public void bar(int x){}
 public Alpha bar(float x)
 {
  return new Alpha();	
 }
}

public class EXAME45_1 extends Alpha
{
 //private void bar (int x){}
 public void bar(int x) {}
 public int bar(String x){ return 1;}
 //public Alpha bar(int x){}
 public void bar(int x,int y){}
 //public int bar(int x) {return x;}
 public EXAME45_1 bar(float x)
 {
  return new EXAME45_1();	
 }

}