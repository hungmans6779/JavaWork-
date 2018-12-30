import java.util.*;
public class cTest21
{
 public static void main(String argv[])
 { 
 	System.out.println("****************************************************");	
 	System.out.println("程式名稱：陣列的運用（排數遊戲）");
 	System.out.println("作    者：HUNG CHIA HUNG");
 	System.out.println("上課導師：許   大   笨");
 	System.out.println("開發日期：2007年6月27日");
 	System.out.println("版權所有，請勿拷貝");
  System.out.println("****************************************************");	
 	Scanner scan=new Scanner(System.in);
 	System.out.print("請輸入您要的矩陣大小是 ? * ? 的大小(奇數值)===>");
 	int num=scan.nextInt();
  int [][]data=new int[num][num];
  int value=1;
  int x=0; //x座標值
  int y=0; //y座標值
  System.out.println();
  for(int i=0;i<num;i++)
  {
   for(int j=0;j<num;j++)
   {
   	//設定起始座標值
   	if(i==0 && j==0)
   	{
   	 x=0;
   	 y=num/2;
   	 data[x][y]=value;
   	}
   	x--;
   	y--; 
   	value++;
    if(x<0)
    { x=num-1; }	
    if(y<0)
    { y=num-1;}	
 
    if(data[x][y]==0)
    {
     data[x][y]=value;	
    }	
    else
    {
     if(x!=(num-1) && y!=(num-1))
     {	
      x+=2;
      y+=1;
     }
     else
     {
     x-=(num-2);
     y-=(num-1);
     }	 
     data[x][y]=value;	
    }	
   if(value==(num*num))
   	 break;
   }
  }
  System.out.println();
  for(int x1=0;x1<num;x1++)
  {
   for(int y1=0;y1<num;y1++)
   	System.out.print(data[x1][y1]+"\t");
   System.out.println();
  }	
  int total=0;
  for(int i=0;i<num;i++)
   total+=data[0][i];
  System.out.println("\n\n數的合是="+total);	
 }
}