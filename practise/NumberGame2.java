import java.util.*;
import java.io.*;
public class  NumberGame2
{
 public static void main(String argv[])
 {
 	 System.out.println("****************************************************");	
 	 System.out.println("�{���W�١G�q�Ʀr�C���ĤG�D");
 	 System.out.println("�@    �̡G�x�ŧ�(HUNG CHIA HUNG)");
 	 System.out.println("�W�Ҿɮv�G�\�j��");
 	 System.out.println("�}�o����G2007�~5��31��");
 	 System.out.println("���v�Ҧ��A�Фū���");
   System.out.println("****************************************************\n");	
  System.out.println("�w����{�x�ŧ��q�Ʀr�C��,�C������J���r��ХH�r�� 0~9�զ�,�Y��J0��ܩ��\n");
  Scanner kegin=new Scanner(System.in);
  //int runCount=1;
  int inputValue=0;
  int endCount=0;
  do
  {
   int runCount=1;
   System.out.print("�п�J�Ʀr�r�����-->");
   int numberLength=kegin.nextInt();	
   int temp=0;
   LinkedHashSet <Integer>ts=new LinkedHashSet<Integer>();	
   do
   {
    temp=(int)(Math.random()*10);
    ts.add(temp);
   }while(ts.size()<numberLength);
   int []randomValue=new int[numberLength];
   int []inputValues=new int[numberLength];
   int countBit=0;
   for(int data:ts) //�ⲣ�ͪ��üƭȩ�JrandomValue���}�C��
   {
    randomValue[countBit]=data;
    countBit++;
   }    
    //�}�l����q���Ʀr���{���X
   gameOver:
   do
   {	  
   	String inputData="";	
    /*
    System.out.println();
   	System.out.print("randomValue=");
    showRandom(randomValue);	
    */
    System.out.print("\n��"+runCount+"����J-->");	
    runCount++;
    try
    {
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     inputData=br.readLine();
    }
    catch(IOException ioe) { }		
    if(inputData.length()!=numberLength)
    {
     System.out.println("��J�r�ƿ��~�A�Э��s��J...");	
    }	
    else
    {
     //���J����Ʀs�JinputValues���}�C��	
     for(int i=0;i<inputData.length();i++)
     {
       inputValues[i]=Integer.parseInt(inputData.substring(i,i+1));
     }
     
     /* ===========================================================*/
     //�P�_�ҿ�J���Ʀr���L����
     boolean showError=false;
     la1:
     for(int i=0;i<inputValues.length-1;i++)
     {
      for(int j=i+1;j<inputValues.length;j++)
      {
       if(inputValues[i]==inputValues[j])
       {
        showError=true;	
        System.out.println("\n��J�Ʀr���i����,�Э��s��J");
        break la1;
       }		
      }		
     }
  	 /* ===========================================================*/	
     
     int okCount=0;
     int errorCount=0;
     
     for(int i=0;i<inputValues.length;i++)
     {
     	c1:
      for(int j=0;j<inputValues.length;j++)
      {
       if(randomValue[i]==inputValues[j])
       {
       	if(i==j) //��ܦ�m���T okCount+1;
       	{
         okCount++;	
         break c1;
        }
        else
        {
         errorCount++;
         break c1;	
        }	     
       }			
      }		
     }
     
     if(!showError)
     {
      System.out.println("\n�����˴����G�G"+okCount+"A "+errorCount+"B");
     } 
     if(okCount==4)
     {
     	 System.out.println("���H�z����F...");
     	 runCount=1;
       break gameOver;
     }	 
    }	
    inputValue=Integer.parseInt(inputData);
    if(inputValue/10==0 && inputValue%10==0)
    {
     System.out.print("\n���T����:");
     showRandom(randomValue);
     System.out.println();
    }	
   }while(inputValue/10!=0); 
   
  System.out.print("\n��1�~��,��2����-->");
  endCount=kegin.nextInt();	
  }while(endCount==1);
 }
 //��ܰ}�C�������e
 public static void showRandom(int[] randomValue)
 {
  for(int data:randomValue)
   System.out.print(data);	
 }	
}