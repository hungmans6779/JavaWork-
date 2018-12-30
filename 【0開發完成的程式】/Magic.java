import java.util.*;
public class Magic
{
 public static void main(String argv[])
 {
 	String input="";
 	int tx,ty;
 	int x=0,y=0;
 	int map[][];
  Scanner scan=new Scanner(System.in);
 	do
 	{
 	 System.out.print("請輸入您的矩陣大小===>");
 	 input=scan.next();
 	 if(input.matches("\\d*"))
 	 {
 	 	int rount=Integer.parseInt(input);
 	  System.out.println("您輸入的值是:"+rount);
 	  map=new int[rount][rount];
 	  map[0][(int)rount/2]=1;
 	  x=0;
 	  y=(int)rount/2;
 	  
 	  //處理資料的傳入
 	  for(int value=2;value<=rount*rount;value++)	
 	  {
 	   tx=x;ty=y;
 	   tx=(x+(rount-1))%rount;
 	   ty=(y+(rount-1))%rount;
 	   if(map[tx][ty]==0)
 	   {
 	   	map[tx][ty]=value;
 	   }	 	
 	   else
 	   {
 	    tx=(x+1)%rount; // 變動y座標值
 	    ty=y;
 	    map[tx][ty]=value;	
 	   }	
 	   x=tx;
 	   y=ty;
 	  }
 	  //************************************
 	  //印出結果顯示
 	  for(int data1[]:map)
 	  {
 	   for(int data:data1)
 	   {
 	    System.out.print(data+"\t");	
 	   }		
 	   System.out.println();
 	  }	
 	 }
 	 else
 	 {
 	  System.out.println("您輸入的格式錯誤，請重新輸入");
 	  continue;
 	 } 
 	 System.out.println("*****************************************************");
 	 System.out.println("如要繼續執行，請按任一鍵繼續....");
   System.out.println("如要離開本程式時，請\"q\"離開，謝謝.....");
   System.out.println("*****************************************************");
 	 input=scan.next();
 	  
 	}while(!input.equalsIgnoreCase("q"));
 }	
}