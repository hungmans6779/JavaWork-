import java.util.*;
public class cTest21
{
 public static void main(String argv[])
 { 
 	System.out.println("****************************************************");	
 	System.out.println("�{���W�١G�}�C���B�Ρ]�ƼƹC���^");
 	System.out.println("�@    �̡GHUNG CHIA HUNG");
 	System.out.println("�W�Ҿɮv�G�\   �j   ��");
 	System.out.println("�}�o����G2007�~6��27��");
 	System.out.println("���v�Ҧ��A�Фū���");
  System.out.println("****************************************************");	
 	Scanner scan=new Scanner(System.in);
 	System.out.print("�п�J�z�n���x�}�j�p�O ? * ? ���j�p(�_�ƭ�)===>");
 	int num=scan.nextInt();
  int [][]data=new int[num][num];
  int value=1;
  int x=0; //x�y�Э�
  int y=0; //y�y�Э�
  System.out.println();
  for(int i=0;i<num;i++)
  {
   for(int j=0;j<num;j++)
   {
   	//�]�w�_�l�y�Э�
   	if(i==0 && j==0)
   	{
   	 x=0;
   	 y=num/2;
   	 data[x][y]=value;
   	}
   	x--;
   	y--; 
   	value++;
    if(x<0)
    { x=num-1; }	
    if(y<0)
    { y=num-1;}	
 
    if(data[x][y]==0)
    {
     data[x][y]=value;	
    }	
    else
    {
     if(x!=(num-1) && y!=(num-1))
     {	
      x+=2;
      y+=1;
     }
     else
     {
     x-=(num-2);
     y-=(num-1);
     }	 
     data[x][y]=value;	
    }	
   if(value==(num*num))
   	 break;
   }
  }
  System.out.println();
  for(int x1=0;x1<num;x1++)
  {
   for(int y1=0;y1<num;y1++)
   	System.out.print(data[x1][y1]+"\t");
   System.out.println();
  }	
  int total=0;
  for(int i=0;i<num;i++)
   total+=data[0][i];
  System.out.println("\n\n�ƪ��X�O="+total);	
 }
}