public class ArrayRotate
{
 public static void  main(String argv[])
 {
 	int [][] oldArray=new int[8][5];
 	int width=oldArray[0].length;
 	int height=oldArray.length;
 
 	for(int i=0;i<width*height;i++)
 	 oldArray[i/width][i%width]=i+1;
 		
  showArray(oldArray);	 
  System.out.println();
  int [][] newArray=ArrayRotate.getFollowRotate(oldArray,270);
  showArray(newArray);
 }
 
 
 
 
 
 /*
 public static int[][] getFollowRotate(int [][] array,int angle) 取得順向旋轉的陣列 
 參數值
 1.欲改變的陣列值
 2.angle的範圍值是 90,180,270
 */
 //-------------------------------------------------------------------------------- 
 public static int[][] getFollowRotate(int [][] array,int angle)
 {
 	int [][] newArray=new int[array.length][array[0].length];
  switch(angle)
  {
   case 90:
     newArray=rotate(array);
   break;
   case 180:
    newArray=rotate(array);
    newArray=rotate(newArray);
   break;
   case 270:
    newArray=rotate(array);
    newArray=rotate(newArray);
    newArray=rotate(newArray);
   break;
   default:
   
   break;	
  }		
 	return newArray;
 }	
 //--------------------------------------------------------------------------------
 
 public static int[][] rotate(int [][] array)
 {
 	int [][] temp=new int[array[0].length][array.length];
 	for(int a=0;a<array.length;a++)
 	{
 	 for(int b=0;b<array[0].length;b++)
 	 {
 	   temp[b][array.length-1-a]=array[a][b]; 	
 	 }		
 	}
 	return temp;	
 }	
 
 
 public static void showArray(int [][] array)
 {
  for(int a=0;a<array.length;a++)
  {
   for(int b=0;b<array[0].length;b++)
   {
    System.out.print(array[a][b]+"\t");	
   }	
   System.out.println();
  }		
 }	
 
 
 		
}	