class VarargTest2
{
 void  calce(int ... value)
 {
 	System.out.println(1);
 }
 void calce(String s1,int ... value)
 {
  System.out.println(2);	
 }
 void calce(String s1,String s2,String s3,int ... value)
 {
 	System.out.println(3);	
 }	
 
 void calce1(String s,int ... k)
 { }
 public static void main(String argv[])
 {
 	new VarargTest2().calce();
 	new VarargTest2().calce("dog","cat","bird",1,2);
 	
 }
}