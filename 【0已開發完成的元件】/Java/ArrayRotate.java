/*
�m�����O�\�໡���n
(1) public static int[][] getFollowRotate(int [][] array,int angle) ���o���V���઺�}�C 
    �Ѽƭ�
    1.�����ܪ��}�C
    2.angle���d��ȬO 90,180,270
(2) public static int[][] getULMirrorRotate(int [][] array) ���o�W�U��g���}�C 
(3) public static int[][] getLRMirrorRotate(int [][] array) ���o���k��g���}�C 
*/

public class ArrayRotate
{
 //�����������ե�	
 public static void  main(String argv[])
 {
 	int [][] oldArray=new int[5][10];
 	int width=oldArray[0].length;
 	int height=oldArray.length;
 
 	for(int i=0;i<width*height;i++)
 	 oldArray[i/width][i%width]=i+1;
 	
 	System.out.println("�}�C�B�z�e.....");	
  showArray(oldArray);	 

  //���V����
  //oldArray=ArrayRotate.getFollowRotate(oldArray,90);
  //�W�U��g
  //oldArray=ArrayRotate.getULMirrorRotate(oldArray);
  //���k��g
  oldArray=ArrayRotate.getLRMirrorRotate(oldArray);
  
  System.out.println("\n�}�C�B�z��.....");
  showArray(oldArray);
 }
 
  //�����������ե�
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
 


 // public static int[][] getFollowRotate(int [][] array,int angle) ���o���V���઺�}�C 
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
 
 //���V90�ױ���}�C��
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
 
 
 // public static int[][] getULMirrorRotate(int [][] array) ���o�W�U��g���}�C 
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
 
 
 
 
 // public static int[][] getLRMirrorRotate(int [][] array) ���o���k��g���}�C 
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