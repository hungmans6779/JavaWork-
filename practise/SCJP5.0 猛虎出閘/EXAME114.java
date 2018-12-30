public class EXAME114
{
 private final String name;
 private int count;
 //public synchronized EXAME114(String name) { this.name=name;	}	//建構子不能使用synchronized
 public EXAME114(String name) { this.name=name;	}	 
 
 public synchronized String getName() {return name; }
 
 public synchronized void increment() { count++; }
 
 public synchronized int getCount() {return count; }
 
 public synchronized void reset() {count=0; }	
 
 public static void main(String argv[])
 {
 }
}