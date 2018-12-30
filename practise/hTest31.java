import java.io.*;
import java.util.*;
public class hTest31
{	
 public static void main(String argv[])
 {
  File file2=new File("StudentScore.txt");
  String strLine="";
  String tempData[][]=new String[50][4];
  String tempScore[][]=new String[50][6];
  int score[][]=new int[50][5];
  int currentCount=0; //記錄目前的暫存計數值
  int totalCount=0; //記錄目前資料的總筆數
  try
  {
   BufferedReader br1=new BufferedReader(new FileReader("StudentData.txt"));
   //讀取StudentData.txt的內容
   while((strLine=br1.readLine())!=null)
   {
   	tempData[currentCount]=strLine.split("\\,");
   	currentCount++; //記錄目前有幾筆資料數
   }
   br1.close();
   totalCount=currentCount;
   currentCount=0;
   
   //讀取StudentScore.txt的內容
   br1=new BufferedReader(new FileReader("StudentScore.txt"));
   while((strLine=br1.readLine())!=null)
   {
   	tempScore[currentCount]=strLine.split("\\,");
   	currentCount++;
   }	
  }
  catch(IOException ioe)
  {
   ioe.printStackTrace();	
  }
  
  //把資料存進Class類別宣告的Studnet的物件內
  Class classA=new Class(totalCount);
  //public void setStudentData(int index,String number,String name,Date birthday,int sex,int[] score){
  
  for(int i=0;i<totalCount;i++)
  {
   currentCount=0;
   for(int i1=1;i1<=5;i1++)
   {
   	score[currentCount][i1]=Integer.parseInt(tempScore[currentCount][i1]);
   	currentCount++;
   }		
   classA.setStudentData(i,tempData[i][0],tempData[i][1],new Date(tempData[i][2]),Boolean.parseBoolean(tempData[i][3])?1:0,score[i]);  
  }	
 //public void setStudentData(int index,String number,String name,Date birthday,int sex,int[] score){
  
   
 }
}