class Test6
{
 public static void main(String argv[])
 {	
  String str1[]=new String[]{"Java "," SCJP"};
  String str2[][]=new String[][]{{"JAVA ","SCJP"},{"SCWCD","SCMAD"}};
  String str3[][]=new String[2][];
  str3[0]=new String[]{"JAVA ","SCJP"};
  str3[1]=new String[]{"SCWCD","SCMAD"};
  for(int i1=0;i1<str1.length;i1++)
  {
   System.out.print(str1[i1]+",");	
  }	
  
  
  System.out.println();
  for(String i1:str1)
   System.out.print(i1+",");
   
   
  System.out.println(); 
  for(int i1=0;i1<str2.length;i1++)
  {
 	 for(int i2=0;i2<str2[i1].length;i2++)
 	 {
 	  System.out.print(str2[i1][i2]+",");	
   }	
  }	 
  
  
  System.out.println();
  for(String s1[]:str2)
   for(String s2:s1) 
    System.out.print(s2+",");
   
   
 } 
 
 
 
}