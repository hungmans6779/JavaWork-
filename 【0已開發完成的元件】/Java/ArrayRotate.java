/*
《此類別功能說明》
(1) public static int[][] getFollowRotate(int [][] array,int angle) 取得順向旋轉的陣列 
    參數值
    1.欲改變的陣列
    2.angle的範圍值是 90,180,270
(2) public static int[][] getULMirrorRotate(int [][] array) 取得上下鏡射的陣列 
(3) public static int[][] getLRMirrorRotate(int [][] array) 取得左右鏡射的陣列 
*/

public class ArrayRotate
{
 //此部份為測試用	
 public static void  main(String argv[])
 {
 	int [][] oldArray=new int[5][10];
 	int width=oldArray[0].length;
 	int height=oldArray.length;
 
 	for(int i=0;i<width*height;i++)
 	 oldArray[i/width][i%width]=i+1;
 	
 	System.out.println("陣列處理前.....");	
  showArray(oldArray);	 

  //順向旋轉
  //oldArray=ArrayRotate.getFollowRotate(oldArray,90);
  //上下鏡射
  //oldArray=ArrayRotate.getULMirrorRotate(oldArray);
  //左右鏡射
  oldArray=ArrayRotate.getLRMirrorRotate(oldArray);
  
  System.out.println("\n陣列處理後.....");
  showArray(oldArray);
 }
 
  //此部份為測試用
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
 


 // public static int[][] getFollowRotate(int [][] array,int angle) 取得順向旋轉的陣列 
 //-------------------------------------------------------------------------------- 
 public static int[][] getFollowRotate(int [][] array,int angle)
 {
  switch(angle)
  {
   case 90:
     array=rotate(array);
   break;
   case 180:
    array=rotate(array);
    array=rotate(array);
   break;
   case 270:
    array=rotate(array);
    array=rotate(array);
    array=rotate(array);
   break;
   default:
    array=rotate(array); 
   break;	
  }		
 	return array;
 }	
 //--------------------------------------------------------------------------------
 
 //順向90度旋轉陣列值
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
 
 
 // public static int[][] getULMirrorRotate(int [][] array) 取得上下鏡射的陣列 
 //--------------------------------------------------------------------------------
 public static int[][] getULMirrorRotate(int [][] array)
 {
 	int [][]temp=new int[array.length][array[0].length];
 	for(int a=0;a<array.length;a++)
 	{
 	 for(int b=0;b<array[0].length;b++)
 	 {
 	 	temp[array.length-1-a][b]=array[a][b];
 	 }		
 	}	
 	return temp;
 }	
 //--------------------------------------------------------------------------------
 
 
 
 
 // public static int[][] getLRMirrorRotate(int [][] array) 取得左右鏡射的陣列 
 //--------------------------------------------------------------------------------
 public static int[][] getLRMirrorRotate(int [][] array)
 {
 	int [][]temp=new int[array.length][array[0].length];
 	for(int a=0;a<array.length;a++)
 	{
 	 for(int b=0;b<array[0].length;b++)
 	 {
 	 	temp[a][array[0].length-1-b]=array[a][b];
 	 }		
 	}	
 	return temp;
 }	
 //--------------------------------------------------------------------------------
 		
}	