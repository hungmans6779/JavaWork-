public class EX13
{
 public static void main(String argv[])
 {
  StringBuffer sb=new StringBuffer("ABCDE");
  showSB(sb);
  System.out.println("�]�w�̤p�e�q�� 150---------------------------------");
  sb.ensureCapacity(150);
  showSB(sb);
  System.out.println("�]�w�̤p�e�q�� 10---------------------------------");
  sb.ensureCapacity(10);
  showSB(sb);
  System.out.println("�]�w���e���׬� 3---------------------------------");
  sb.setLength(3);
  showSB(sb);
 
 }
 public static void showSB(StringBuffer sb)
 {
  System.out.print("sb=\""+sb+"\"");
  System.out.print("\t���e���׬� "+sb.length());
  System.out.println("\t�e�q�� "+sb.capacity());
 }
}