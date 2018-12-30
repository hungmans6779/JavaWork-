public class ReassigningAReferenceVariableTest2
{
 public static void main(String argv[])
 {
  StringBuffer s=getStringBuffer();
 }
 public static StringBuffer getStringBuffer()
 {
 	StringBuffer s=new StringBuffer("JAVA");
 	return s;
 }	
}