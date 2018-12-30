public class ReassigningAReferenceVariableTest2
{
 public static void main(String argv[])
 {
  StringBuffer s=getStringBuffer();
  //doComplicatedStuff();
 }
 static StringBuffer getStringBuffer()
 {
 	StringBuffer s=new StringBuffer("Java");
 	return s;
 }	
 
}