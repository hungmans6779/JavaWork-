public class Test
{
 public static void main(String argv[])
 {
  int a[];
  int[] a1;
  int a2[]=new int[5];
  int a3[]={1,2,3,4,5};
  int a4[]=new int[5];
  a4[0]=0;
  a4[1]=1;
  a4[2]=2;
  a4[3]=3;
  a4[4]=4;
  
  
   System.out.println(a4[1]);
  if(a4[2]>a4[0])
   System.out.println("true");
  else
   System.out.println("false");
 
  int a5[][]={{1,2},{1,2,3},{1,2,3,4}};
  int a6[]=new int[50];
  int a8[][]=new int[3][];
  a8[0]=new int[1];
  a8[1]=new int[2];
  a8[2]=new int[3];
  

  int a7[]=new int[99999];
  a7=a6;
  long sum=0;
  for (int i=0;i<a7.length;i++)
  {
    a7[i]=i;
    sum+=a7[i];
    System.out.print(a7[i]+",");
  } 
   System.out.println(sum);

  String str[];
  String[] str1;
  String[] str2=new String[5];
  String str3[]={"a","b","c","d","e"};
  String str4[]=new String[5];
  str4[0]="a";
  str4[1]="b";
  str4[2]="c";
  str4[3]="d";
  str4[4]="e";
  
  
  System.gc();
 }
} 