public class OverloadTest1
{
 public static void main(String argv[])
 {
 
 }
 void eat(){}
 //void eat() throws Exception {}
 private void eat(int i){}
 public String eat(int k,long l){ return "eat"; }
 public String eat(long m,int n){ return "eat"; }
}