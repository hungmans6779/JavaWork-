import java.util.*;
public class StudentSystem{
	public static void main(String[] args){
		Scanner keyin=new Scanner(System.in);
		System.out.print("�п�J�ǥͤH��-->");
		int count=keyin.nextInt();
		int[] student=new int[count];
		boolean input=false;
		int select=0;
		do{
			System.out.print("\n�п�ܪA�ȿﶵ:\n1.��J���Z 2.�C�L���Z 3.�������� 4.�̰��� 5. �̧C�� 6.�Ƨ� 7.���}-->");
			select=keyin.nextInt();

			switch(select){
			case 1:	
				if(input){
					System.out.println("���Z�w��J����");
					break;	
				}
				for(int x=0;x<student.length;x++){
					System.out.print("��J��"+(x+1)+"�Ӿǥͪ����Z-->");
					int temp=keyin.nextInt();
					if(temp<0 || temp>100){
						System.out.println("��J���~,�Э��s��J");
						x--;
					}else{
						student[x]=temp;
					}
				}
				input=true;
				break;
			case 2:
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
				for(int x=0;x<student.length;x++){
					System.out.println("��" +(x+1)+ "��P��:" + student[x]);
				}
				break;
			case 3:
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
				float total=0;
				for(int x=0;x<student.length;x++){
					total=total+student[x];
				}
				System.out.println("�������Ƭ�:"+ total/student.length);
				break;
			case 4:
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}{
				int height=student[0];
				for(int x=0;x<student.length;x++){
					if(height<student[x]){
						height=student[x];
					}
				}
				System.out.println("�̰�����:"+ height);
				}
				break;
			case 5:
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
				int low=0;
				for(int x=1;x<student.length;x++){
					if(student[low]>student[x]){
						low=x;
					}
				}
				System.out.println("�̧C��:" + student[low]);
				break;
			case 6:
				if(!input){
					System.out.println("�Х���J���Z���Z");
					break;	
				}
				/*
				{
				for(int y=0;y<student.length-1;y++){
					int height=y;
					for(int x=y+1;x<student.length;x++){
						if(student[height]<student[x]){
							height=x;
						}
					}
					int temp=student[height];
					student[height]=student[y];
					student[y]=temp;
				}
				}
				*/
				Arrays.sort(student);
			}
		}while(select!=7);
	}
}