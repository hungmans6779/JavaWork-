public class Test9
{
 private static enum Week
 {
  Sunday,
  Monday,
  Tuesday
  {
   public String toString()
   {
   	return "�����ڬO�Q�мg��";
   }	
  },
  Wednesday,
  Thursday
  {
   public String toString()
   {
   	return "�u�V�|�ڤ]�O�Q�мg�F.....";
   }	
  },
  Friday,
  Saturday
 }
 public static void main(String argv[])
 {
 	// �Ĥ@�ب�Enum�C�|���A�Ȫ���k
 	System.out.print(Week.Sunday);
 
 	
 	// �ĤG�ب�Enum�C�|���A�Ȫ���k

 	System.out.println("\n====================");
 	Week week=Week.Sunday;
 	System.out.print(week.Sunday);
 	
 	
 	// �ĤT�ب�Enum�C�|���A�Ȫ���k
 	System.out.println("\n====================");
 	Week [] week2=Week.values();
 	for(int i=0;i<week2.length;i++)
 	{
 	 System.out.print(week2[i]+",");	
 	}	
 	
 	// �ĥ|�ب�Enum�C�|���A�Ȫ���k
 	System.out.println("\n====================");
 	for(Week week3:Week.values())
 	{
 	 System.out.print(week3+",");	
 	}	
 	
 	// �Ĥ��ب�Enum�C�|���A�Ȫ���k
 	System.out.println("\n====================");
 	System.out.print(Week.valueOf("Sunday"));
 }	
} 