class EX16
{
 public static void main(String argv[])
 {
  int value=Integer.parseInt(argv[0]);
  int i=2;
  boolean prime=true;
  do
  {
  	if((value%i==0)&&(value!=2))
  	{
  	 prime=false;	
  	}	
  	i++;
  }while(i<value);	
  System.out.println(value+" 是"+(prime?"質數":"不是質數"));
 }
}