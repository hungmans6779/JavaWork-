import java.util.*;
public class Magic
{
 public static void main(String argv[])
 {
 	String input="";
 	int tx,ty;
 	int x=0,y=0;
 	int map[][];
  Scanner scan=new Scanner(System.in);
 	do
 	{
 	 System.out.print("�п�J�z���x�}�j�p===>");
 	 input=scan.next();
 	 if(input.matches("\\d*"))
 	 {
 	 	int rount=Integer.parseInt(input);
 	  map=new int[rount][rount];
 	  map[0][rount/2]=1;
 	  //�B�z��ƪ��ǤJ
 	  for(int value=2;value<=rount*rount;value++)	
 	  {
 	   tx=x;ty=y;
 	   tx=(x+(rount-1))%rount;
 	   ty=(y+(rount-1))%rount;
 	   if(map[tx][ty]==0)
 	   {
 	   	map[tx][ty]=value;
 	   }	 	
 	   else
 	   {
 	    tx=x;
 	    ty=(y+1)%rount;
 	    map[tx][ty]=value;	
 	   }	
 	   x=tx;
 	   y=ty;
 	  }
 	  //************************************
 	  //�L�X���G���
 	  for(int data1[]:map)
 	  {
 	   for(int data:data1)
 	   {
 	    System.out.print(data+"\t");	
 	   }		
 	   System.out.println();
 	  }	
 	 }
 	 else
 	 {
 	  System.out.println("�z��J���榡���~�A�Э��s��J");
 	  continue;
 	 } 
 	 System.out.println("*****************************************************");
 	 System.out.println("�p�n�~�����A�Ы����@���~��....");
   System.out.println("�p�n���}���{���ɡA��\"q\"���}�A����.....");
   System.out.println("*****************************************************");
 	 input=scan.next();
 	  
 	}while(!input.equalsIgnoreCase("q"));
 }	
}