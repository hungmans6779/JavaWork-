import java.io.*;
public class Index
{
 static int max=0;
 static int count=0;
 static int truePrimeArray[];
 
 
 //�{���i�J�I
 //**************************************************************
 public static void main(String argv[])
 { 
  Author.showAuthor();
  System.out.println("\n\n\n");
  int inputNumber[]=new int[2];
  do
  {
   try
   {
    System.out.print("�п�J�A���� "+(count+1)+" �ӼƦr = ");
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(ir);
    if(count==0)
    {
     inputNumber[0]=Integer.parseInt(br.readLine());
    }
    else
    {
     inputNumber[1]=Integer.parseInt(br.readLine());
    } 
    
    if(inputNumber[0]>inputNumber[1])
    { max=inputNumber[0]; }
    else
    { max=inputNumber[1]; }    
   count++;
   }
   catch(IOException e)
   {
    e.printStackTrace();
   }  
  }while(count<2);
   
  PrimeFactor(max);  //�M��X��]�ƪ��{��
  Author.showAuthor();
  int commonFactor=1;
  System.out.println("=====================================================");
  System.out.print("�z�ҿ�J���Ʀr "+inputNumber[0]+" �M "+inputNumber[1]);
  for(int commonCount=0;commonCount<truePrimeArray.length;commonCount++)
  {
   if((inputNumber[0]%truePrimeArray[commonCount]==0)&&(inputNumber[1]%truePrimeArray[commonCount]==0))
   {
    commonFactor*=truePrimeArray[commonCount];
    inputNumber[0]/=truePrimeArray[commonCount];
    inputNumber[1]/=truePrimeArray[commonCount];
    commonCount--;
   }
  }
  System.out.print("�̤j���]�Ƭ� �G "+commonFactor);  
  System.out.println("\n=====================================================");
 }
 //**************************************************************


 
 //�M��X��ƪ��Ƶ{��
 //**************************************************************
 public static void PrimeFactor(int max)
 {
  //primeArray�O�ΨӼȮɦs��|���ͪ���]�ơA
  //��}�C�j�p�O�ҿ�J�ƪ��̤j��.....
  int primeArray[]=new int[max]; 
  int primeCount=0;
  int integer1=0,integer2=0,integer3=0,integer4=0;
  int i=0;
  for (i=1;i<=max;i++)
  { 
   if (i<10)
   {
     int aa,bb=0;
     for (int k=2;k<=7;k+=2)
      {
       aa=i/k;
       bb=i%k;
       if (aa==1 && bb==0)
       {
        primeArray[primeCount]=i;
        primeCount++;
       }  
       if(k==2)
       {
        k--;
       }
      } 
   }  
   else
   {
    integer1=i%2;
    integer2=i%3;
    integer3=i%5;
    integer4=i%7;
    if (integer1!=0 && integer2!=0 && integer3!=0 && integer4!=0)
    {
     primeArray[primeCount]=i;
     primeCount++;
    } 
   }
  } 
   //����truePrimeArray���}�C�Ӧs���J���̤j�ƩҦ����ͪ���]��
  truePrimeArray=new int[primeCount];
  System.arraycopy(primeArray,0,truePrimeArray,0,primeCount);  
  //showTruePrimeArray();//���truePrimeArray�}�C�����e��  
 } 
 //**************************************************************
 
 
 
 //���truePrimeArray�}�C���e�Ȫ��Ƶ{��
 //**************************************************************
 public static void showTruePrimeArray()
 {
  System.out.print("truePrimeArray[] = [");
  for(int kk=0;kk<=truePrimeArray.length-2;kk++)
  {
   System.out.print(truePrimeArray[kk]+",");
  }
  System.out.print(truePrimeArray[truePrimeArray.length-1]+"]");
  System.out.println("\n length = "+truePrimeArray.length);
 }
 //**************************************************************
}