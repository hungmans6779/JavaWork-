import java.util.*;
public class cTest18
{
 public static void main(String argv[])
 {
 	Scanner scan=new Scanner(System.in);
 	int peopleCount=0; //peopleNum;
 	System.out.println("****************************************************");	
 	 System.out.println("程式名稱：成績單列印系統");
 	 System.out.println("作    者：HUNG CHIA HUNG");
 	 System.out.println("上課導師：許   大   笨");
 	 System.out.println("開發日期：2007年6月25日");
 	 System.out.println("版權所有，請勿拷貝");
   System.out.println("****************************************************");	
 	System.out.print("\n請輸入學生人數===>");
   peopleCount=scan.nextInt(); 
  int []grade=new int[peopleCount];
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
   
   if(select>=2 && select<=6)
   {
   	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★");
    System.out.println("您的查詢結果如下");
    System.out.println("★★★★★★★★★★★★★★★★★★★★★★★");	
   }
   
   switch(select)
   {   	
    case 1: //成績輸入
     System.out.println("您目前班上有 "+peopleCount+" 個學生");
     for(int i=0;i<peopleCount;i++)
     {
     	System.out.print("請輸入第 "+(i+1)+" 位同學的成績===>");
     	grade[i]=scan.nextInt();
     }	
     break;
    case 2: //成績列印
      for(int i=0;i<grade.length;i++)
       System.out.println("第 "+(i+1)+" 位同學的成績是 "+grade[i]+"分");
     break;
    case 3: //平均成績
     for(int data:grade)
      total+=data;	
     System.out.println("所有學生的平均成績是:"+(total/peopleCount));
     break;
    case 4: //最高分
     int max=grade[0];
     for(int i=1;i<grade.length;i++)
     {
     	if(max<grade[i])
     	 max=grade[i];
     }	
     System.out.println("最高分的成績是: "+max+"分");
     break;
    case 5: //最低分
     int min=grade[0];
     for(int i=1;i<grade.length;i++)
     {
      if(min>grade[i])
       min=grade[i];
     }	
     System.out.println("最低分的成績是: "+min+"分");
     break;
    case 6: //成績排序
     Arrays.sort(grade);
     System.out.println("排序後的成績如下");
     for(int i=0;i<grade.length;i++)
     	  System.out.println(grade[i]+"分");
     break;
    case 7: //離開
     System.exit(0);
     break;
    default:
     System.out.println("您的選擇不在此功能選單中，請重新輸入...");
     break;
       	
   }	
   
  } 
 }
}