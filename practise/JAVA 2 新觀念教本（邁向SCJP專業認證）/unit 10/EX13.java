public class EX13
{
 public static void main(String argv[])
 {
  StringBuffer sb=new StringBuffer("ABCDE");
  showSB(sb);
  System.out.println("設定最小容量為 150---------------------------------");
  sb.ensureCapacity(150);
  showSB(sb);
  System.out.println("設定最小容量為 10---------------------------------");
  sb.ensureCapacity(10);
  showSB(sb);
  System.out.println("設定內容長度為 3---------------------------------");
  sb.setLength(3);
  showSB(sb);
 
 }
 public static void showSB(StringBuffer sb)
 {
  System.out.print("sb=\""+sb+"\"");
  System.out.print("\t內容長度為 "+sb.length());
  System.out.println("\t容量為 "+sb.capacity());
 }
}