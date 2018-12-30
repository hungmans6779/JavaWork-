public class EXAME1_06
{
 public static void main(String argv[])
 {
  doStuff(1);
  doStuff(1,2,3,4,5,6);
 }
 //public static void doStuff(int [] x) {}	½sÄ¶¥¢±Ñ
 
 public static void doStuff(int x,int ... doArgs)
 {
 	System.out.print(x+"\t");
 	for(int num:doArgs)
 	{
 	 System.out.print(num+"\t");	
 	}	
 	System.out.println();
 }	
 
}