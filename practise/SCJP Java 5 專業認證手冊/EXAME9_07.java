public class EXAME9_07 extends Thread
{
 int a,b;	
 public static void main(String argv[])
 {
 
 }
 public void run()
 {
 }
 /*
 public synchronized int read(){return a+b;}
 public synchronized void set(int a,int b){this.a=a;this.b=b;}
*/

public int read(){ synchronized(this){return a+b;}}	 
public void set(int a,int b){synchronized(this){this.a=a;this.b=b;}}
}