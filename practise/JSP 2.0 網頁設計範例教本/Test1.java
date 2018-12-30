public class Test1
{
 public static void main(String argv[])
 {
 	System.out.print(new Test1().toUnicode("我是小飛仔"));
 }		
 public String toUnicode(String s)
 {
 	byte buffer[]=new byte[s.length()*2];
 	if(s==null || s.length()==0)
 	 return null;
  int i,j;
  char c;
  for(i=0,j=0;i<s.length();i++)
  {
   if(s.charAt(i)>=0x100)
   {
    c=(char)s.charAt(i);
    System.out.print("c="+c);	
    byte buf[]=(""+c).getBytes();
    buffer[j++]=buf[0];
    buffer[j++]=buf[1];
    System.out.print("buf[0]="+buf[0]+",buf[1]="+buf[1]);
    System.out.println("\n=======");
   }
   else
    buffer[j++]=(byte)s.charAt(i);
  }		
  return new String(buffer,0,j); 
 }	
}	