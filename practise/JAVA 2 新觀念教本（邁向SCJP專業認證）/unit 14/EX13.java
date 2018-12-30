import java.util.*;
import java.io.*;
public class EX13
{
 public static void main(String argv[])
 {
 	String path;
  if(argv.length<1)
   path=".";
  else
   path=argv[0];
   
  File f=new File(path);  
  if(!f.isDirectory())
  {
   System.out.println(argv[0]+"¤£¬O¥Ø¿ý");
   return;	
  }	  
  
  File fa[]=f.listFiles();
  for(File t:fa)
  {
   System.out.printf("%28s %8d %5s %s\n",new Date(t.lastModified()),t.length(),(t.isDirectory()?"<Dir>":"  "),t.getName());	
  }	 
 }
}