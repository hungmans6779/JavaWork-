import java.util.*;
public class NumberGame1
{
 public static void main(String argv[])
 {
  Scanner kegin=new Scanner(System.in);
  int endCountinue=0;
  System.out.println("****************************************************");	
 	System.out.println("�{���W�١G�q�Ʀr�C���Ĥ@�D");
 	System.out.println("�@    �̡G�x�ŧ�(HUNG CHIA HUNG)");
 	System.out.println("�W�Ҿɮv�G�\�j��");
 	System.out.println("�}�o����G2007�~5��31��");
 	System.out.println("���v�Ҧ��A�Фū���");
  System.out.println("****************************************************\n");	
  System.out.println("**********�w��ϥάx�ŧ����q�Ʀr�C��*********");
  do
  {
   System.out.print("\n�п�J�Ʀr�d��(100)�H�W-->");
   int input=kegin.nextInt();
   if(input<100)
   { input=100; }
   int randomValue=(int)(Math.random()*input);
   if(input<randomValue)
   {
    sureRandom(input);
   }	
   
   //System.out.println("randomValue="+randomValue);
   int runCount=0;
   
   if(input<=100)
      runCount=5;
   else if(input<=1000)
      runCount=10;
   else if(input<=10000)
      runCount=55;
   else if(input<=100000)
      runCount=505;
   else if(input<=1000000)
      runCount=5005;
   else if(input<=10000000)
      runCount=50005;
   else if(input<=100000000)
      runCount=500005;                               
   else
   {
   	  runCount=5000005;
   }	
   System.out.println("\n�z�@��"+runCount+"�����|\n");
   //�}�l����q�Ʀr�C	
   int inputValue=0; //�C���L�{���C������J�ܼ�
   int guessCount=0; //�O���q�D������
   for(int i=1;i<=runCount;i++)
   {
   	System.out.print("��"+i+"��-->");
   	inputValue=kegin.nextInt();
   	if(inputValue>randomValue)
   	{
   	 if(i!=runCount)	
   	  System.out.println("�C�@�I");
   	} 
   	else if(inputValue<randomValue)
   	{
   	 if(i!=runCount)	
   	  System.out.println("���@�I");
   	} 
    else
    {
     guessCount=i+1;
     break;	
    }	
    guessCount=i;
   } 
   System.out.println();
   if(runCount!=guessCount)
   {
    if((guessCount-1)==1)
     System.out.println("�z���u�q�F�I�u�O�ƨƦp���I");
    else if(guessCount<=(runCount/5)*2)
     System.out.println("��I������I�i�H�h�R�ө��B�ֳz�F...");
    else if(guessCount<=((runCount/5)*3))
     System.out.println("��I���I���ǤF...�A�V�O�ݬݳ�I");
    else
    {
     System.out.println("�A�m�߬ݬݧa�I���Z�@�w�|��n��...");
    }
   } 
   else 
   {
   	System.out.println("�A���A�F,�۫H��,�`���@�ѧA�|���\��");
   } 
   System.out.println("\n���T����:"+randomValue);
   System.out.print("\n�O�_�~�Z�C��:1.�O 2.�_--->");
   endCountinue=kegin.nextInt();
  }while(endCountinue!=2);
 }	
 public static int sureRandom(int input)
 {
 	int randomValue=0;
 	randomValue=(int)(Math.random()*input);
 	return randomValue;
 }		
}