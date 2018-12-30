import java.io.*;
public class EXAME6_12
{
 static String []dirs={"dir1","dir2"};	
 public static void main(String argv[])
 {
  for(String d:dirs)
  {
   String path=d;
   File file=new File(path,argv[0]);
   System.out.println(file.isFile());	
  }	
 }
}