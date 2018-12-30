public class Knight
{
 int [][]dd={{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1},{-2,1},{-1,2}};
 int map[][]=new int[8][8];

 public static void main(String argv[])
 {
  new Knight();
 }		
 public Knight()
 {
 	showMap();
 	map[1][1]=1;
 	int x=1,y=1;
 	int min=0,minPos=0;
 	int []out=new int[8];
 	for(int n=2;n<=64;n++)
 	{
 	 for(int a=0;a<8;a++)
 	 {
 	 	int tx=x+dd[a][0];
 	 	int ty=y+dd[a][1];
 	 	if(tx<0 || tx>7 || ty<0 || ty>7)
 	 	{
 	 	 out[a]=10;
 	 	 continue;
 	 	} 
 	 	else
 	   out[a]=checkValue(tx,ty);
 	 } 
 	 min=out[0];
 	 for(int i=0;i<8;i++)
 	 {
 	  if(min>out[i])
 	  {
 	   min=out[i];
 	   minPos=i;	
 	  }		
 	 }	
 	 x=x+dd[minPos][0];
 	 y=y+dd[minPos][1];
 	 System.out.println(x+" , "+y);
   map[x][y]=n;
 		
 	}	
 	
 }	
 int checkValue(int x,int y)
 {
  int tx=0,ty=0;
  int n=0;
  //if(x<0 || x>7 || y<0 || y>7) return 9;
  if(map[x][y]!=0) return 9;
  for(int a=0;a<8;a++)
  {
   tx=x+dd[a][0];
   ty=y+dd[a][1];	
   if(tx<0 || tx>7 || ty<0 || ty>7) continue;
   if(map[tx][ty]==0) n++;
  }
  if(n<=0) return 8;
  return n;		
 }	
 void showMap()
 {
 	for(int i=0;i<map.length;i++)
 	{
 	 for(int j=0;j<map[0].length;j++)
 	 {
 	 	System.out.print(map[i][j]+"\t");
 	 }		
 	 System.out.println();
 	}	
 }	
}	