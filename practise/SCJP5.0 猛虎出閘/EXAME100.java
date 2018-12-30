public class EXAME100
{
 public static void main(String argv[])
 {
  
 }
 public String toString()
 {
  StringBuffer buffer=new StringBuffer();
  buffer.append('<');
  buffer.append(this.name);
  buffer.append('>');
  return buffer.toString();	
 }	
}