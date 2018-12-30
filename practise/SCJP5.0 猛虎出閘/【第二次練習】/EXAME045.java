class Alpha
{
 public void bar(int ...x){}
 public void bar(int x){}
}

public class EXAME045 extends Alpha
{
 public void bar(int x){}
 public int bar(String x) 
 {
	return 1;
 }
 public void bar(int x,int y)
 {
 	
 }
 //public Alpha bar(int x){}
 //public int bar(int x){return x; }
 
}