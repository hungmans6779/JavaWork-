import java.util.*;
public class CaluartorTest3
{
 public static void main(String argv[])
 {
 	Scanner kegin=new Scanner(System.in);
 	while(true)
 	{
 	System.out.println("�~���d��ȬO(1980�~���᪺�~��)");
  System.out.print("�п�J�~��:");
  int year=kegin.nextInt();
  if(year<1980)
  {
   System.out.println();
   System.out.print("�Э��s��J�~��(1980�~���᪺�~��):");
   year=kegin.nextInt();
  }	
   System.out.print("�п�J���:");
   int month=kegin.nextInt();
   System.out.println();
   System.out.println("\t\t"+year+" �~ "+month+" ��");
   System.out.println("\n��\t�@\t�G\t�T\t�|\t��\t��");
   int yearCount=1980; //�p��q1980�~�}�l�]�{���X
   int monthCount=1;  //�q1980�~1��}�l�]�{���X
   int colSpace=0;
   int daysTotal=0;  //�p��X1980�~���n�d�ߪ��`�Ѽ�
   while(yearCount<=year)
   {
    if(yearCount<=year && monthCount==month) //�p��X��n�C�L������g�L���`�Ѽ�
    {
      for(int i=1;i<=(yearCount<year?12:month);i++) //��X�q1��]��12������~����Ů�
       daysTotal+=daysCount(i,yearCount); 
    }
    
    
    if(monthCount==13) //�P�_�Ӥ�w�g��12����F.. �~���N�[1
    {
     yearCount++; //�ּW�@�~
     monthCount=1; //	
    }	 
    /*
    if(monthCount==12)
    {
     yearCount++;
    }	
    */    	
    //monthCount++;		
         	
    	
    if(yearCount==year	&& monthCount==month) //��ܷ��몺����
    {	
    	
     int nowMonthDays=daysCount(month,year);
     
      daysTotal=daysTotal-nowMonthDays;
    
     colSpace=(daysTotal+2)%7;	
  
     for(int i=1;i<=colSpace;i++)
      System.out.print("\t");
     
     int colCount=0;
     //System.out.println("month="+nowMonthDays);
     
     for(int i=1;i<=nowMonthDays;i++)
     {
      if(i<=(7-colSpace))
      {
       System.out.print(i+"\t");	
      }		
      else
      {
       if(colCount==7)
       {
       	System.out.println();
        colCount=0;	
       }
       colCount++;
       System.out.print(i+"\t");		
      }
      if(i==(7-colSpace))
     	 System.out.println();	
     }
     System.out.println();
     System.out.println("daysTotal= "+daysTotal);
     System.out.println("colSpace= "+colSpace);
     System.out.println("nowMonthDays="+nowMonthDays);	
    }
    /*
    if(monthCount==12) //�P�_�Ӥ�w�g��12����F.. �~���N�[1
    {
     yearCount++; //�ּW�@�~
     monthCount=1; //	
    }	     	
    monthCount++;		
   */
    monthCount++; 
   }
   System.out.println();	
  } 
 }
 //�P�_�Ӥ�����Ѽ�
 public static int daysCount(int monthTemp,int yearTemp)
 {
 	int days=0;
 	switch(monthTemp)
  {
   case 1:
   case 3:
   case 5:
   case 6:
   case 8:
   case 10:
   case 12:
         days=31;
         break;
   case 4:
   case 7:
   case 9:
   case 11:
         days=30;
         break;
   case 2:	
       if(yearTemp%4==0)
       {
       	if(((yearTemp%4==0)||(yearTemp%400==0)) &&(yearTemp%100!=0))
         days=29;
        else
         days=28; 
       }
       else
       {
        days=28;	
       }	
   default:
       break;
  }	
  return days;
 }	
}