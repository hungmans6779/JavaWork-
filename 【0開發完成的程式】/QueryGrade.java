import java.util.*;
import java.text.*;
public class QueryGrade
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	int peopleCount=0; //peopleNum;
 	boolean showResult=false;
 	System.out.println("****************************************************");	
 	 System.out.println("程式名稱：成績單列印系統");
 	 System.out.println("作    者：HUNG CHIA HUNG");
 	 System.out.println("上課導師：許   大   笨");
 	 System.out.println("開發日期：2007年6月25日");
 	 System.out.println("版權所有，請勿拷貝");
   System.out.println("****************************************************");	
 	System.out.print("\n請輸入學生人數===>");
   peopleCount=scan.nextInt(); 
  int [][]grade=new int[peopleCount][2];
 	while(true)
 	{
 	 System.out.println("\n\n****************************************************");	
   System.out.println("請選擇服務項目");
   System.out.println("1.成績輸入");
   System.out.println("2.成績列印");
   System.out.println("3.平均成績");
   System.out.println("4.最高分");
   System.out.println("5.最低分");
   System.out.println("6.成績排序");
   System.out.println("7.離開");
   System.out.println("****************************************************\n\n");	
   System.out.print("請輸入您要的選項==>");
   int select=scan.nextInt();
   double total=0;  //計算成績的總合   
   if((select>=2 && select<=6) && showResult)
   {
   	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★");
    System.out.println("您的查詢結果如下");
   }
   else if(select>1)
   {
   	System.out.println("◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎");
   	System.out.println("抱歉！！！請您先輸入所有學生的成績，才能使用2-6的功能選單喔..........");
   	System.out.println("如有任何問題，請回覆到hungmans6779@yahoo.com.tw的信箱..bye");
   	System.out.println("◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎◎");
   }	
   switch(select)
   {   	
    case 1: //成績輸入
     System.out.println("您目前班上有 "+peopleCount+" 個學生");
     ll:
     for(int i=0;i<peopleCount;i++)
     {
     	System.out.print("請輸入第 "+(i+1)+" 位同學的成績===>");
     	String temp=scan.next();
     	if((!temp.matches("\\d\\d")) && ( temp.length()==2))
     	{
     	 System.out.println("您輸入的成績格式錯誤，請重新輸入...");	
     	 i--;
     	 continue ll;
     	}	
     	else if((!temp.matches("\\d\\d\\d")) && ( temp.length()==3))
     	{
     	 System.out.println("您輸入的成績格式錯誤，請重新輸入...");	
     	 i--;
     	 continue ll;
     	}	
     	else if(temp.length()>=4) 
     	{
     	 System.out.println("您輸入的成績格式錯誤或超出範圍值，請重新輸入...");	
     	 i--;
     	 continue ll;	
     	}	
     	grade[i][0]=i+1;
      grade[i][1]=Integer.parseInt(temp); 
     	if(grade[i][1]<0 || grade[i][1]>100)
     	{
     	 System.out.println("??????????????????????????????????????????");	
     	 System.out.println("您輸入的值不在0-100分的範圍內！！！");
     	 System.out.println("請重新輸入...");	
     	 System.out.println("??????????????????????????????????????????");
     	 i--;	
     	}	
     }	
     showResult=true;
     break;
    case 2: //成績列印
     if(showResult)
     {
      for(int i=0;i<grade.length;i++)
       System.out.println("第 "+(i+1)+" 位同學的成績是 "+grade[i][1]+"分");
     }  
     break;
    case 3: //平均成績
     if(showResult)
     {
      for(int i=0;i<grade.length;i++)
      {
       total+=grade[i][1];	
      } 
      NumberFormat nf=NumberFormat.getNumberInstance();
      nf.setMaximumFractionDigits(2);
      nf.setMinimumFractionDigits(2);
      String avg=nf.format(total/peopleCount);
      System.out.println("所有學生的平均成績是: "+avg+" 分");
     } 
     break;
    case 4: //最高分
     if(showResult)
     {
      int max=grade[0][1];
      for(int i=1;i<grade.length;i++)
      {
      	if(max<grade[i][1])
      	 max=grade[i][1];
      }	
      System.out.println("最高分的成績是: "+max+"分");
     } 
     break;
    case 5: //最低分
     if(showResult)
     {
      int min=grade[0][1];
      for(int i=1;i<grade.length;i++)
      {
       if(min>grade[i][1])
        min=grade[i][1];
      }	
      System.out.println("最低分的成績是: "+min+"分");
     } 
     break;
    case 6: //成績排序
     if(showResult)
     {
     	int tempGrade=0;
     	int tempName=0;
     	System.out.println("成績名次由高而低排序結果如下");
      for(int i=0;i<grade.length-1;i++)
      {
       for(int j=i;j<grade.length;j++)
       {
       	//按照成績的由高而低排序
        if(grade[i][1]<grade[j][1])
        {
         //成績的對調
         tempGrade=grade[i][1];
         grade[i][1]=grade[j][1];
         grade[j][1]=tempGrade;
         //姓名的對調
         tempName=grade[i][0];
         grade[i][0]=grade[j][0];
         grade[j][0]=tempName;
        }		
       }		
      }
      for(int i=0;i<grade.length;i++)
       System.out.println("第 "+grade[i][0]+" 位同學的成績是:"+grade[i][1]+" 分");	
     } 	  
      break;
    case 7: //離開
     System.exit(0);
     break;
    default:
     System.out.println("您的選擇不在此功能選單中，請重新輸入...");
     break;   	
   }	
   if((select>=2 && select<=6) && showResult)
    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★");	
  } 
 }
}