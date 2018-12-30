class EXAME1_4
{
 public static void main(String argv[])
 {
 	boolean x=true;
 	int a,b=1,c=2;
  if(x){
   a=b;
  }else{
  a=c; 
  }
  System.out.println(a);
  System.out.println(a=x?b:c);
 } 
}