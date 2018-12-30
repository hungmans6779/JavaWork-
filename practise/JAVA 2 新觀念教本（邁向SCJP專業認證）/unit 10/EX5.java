public class EX5
{
 public static void main(String argv[])
 {
  String pattern[]={"®ç","¤ß","¿j","±ö"};
  String size[]={"1","2","3","4","5","6","7","8","9","O","J","Q","K"};
  String card[]=new String[52];
  for(int i=0;i<pattern.length;i++)
  {
   for(int j=0;j<size.length;j++)
   {
    card[i*size.length+j]=pattern[i]+size[j];
   }
  }
  String temp;
  int newNum;
  for(int i=0;i<card.length;i++)
  {
   newNum=(int)(Math.random()*card.length);
   temp=card[i];
   card[i]=card[newNum];
   card[newNum]=temp;	
  }	
  for(int i=0;i<card.length;i++)
  {
   System.out.print(card[i]+"\t");
   if((i+1)%13==0)
   {
   	System.out.println();
   }		
  }	
 }
}