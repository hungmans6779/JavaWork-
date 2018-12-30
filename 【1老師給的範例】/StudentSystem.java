import java.util.*;
public class StudentSystem{
	public static void main(String[] args){
		Scanner keyin=new Scanner(System.in);
		System.out.print("請輸入學生人數-->");
		int count=keyin.nextInt();
		int[] student=new int[count];
		boolean input=false;
		int select=0;
		do{
			System.out.print("\n請選擇服務選項:\n1.輸入成績 2.列印成績 3.平均分數 4.最高分 5. 最低分 6.排序 7.離開-->");
			select=keyin.nextInt();

			switch(select){
			case 1:	
				if(input){
					System.out.println("成績已輸入完畢");
					break;	
				}
				for(int x=0;x<student.length;x++){
					System.out.print("輸入第"+(x+1)+"個學生的成績-->");
					int temp=keyin.nextInt();
					if(temp<0 || temp>100){
						System.out.println("輸入錯誤,請重新輸入");
						x--;
					}else{
						student[x]=temp;
					}
				}
				input=true;
				break;
			case 2:
				if(!input){
					System.out.println("請先輸入成績成績");
					break;	
				}
				for(int x=0;x<student.length;x++){
					System.out.println("第" +(x+1)+ "位同學:" + student[x]);
				}
				break;
			case 3:
				if(!input){
					System.out.println("請先輸入成績成績");
					break;	
				}
				float total=0;
				for(int x=0;x<student.length;x++){
					total=total+student[x];
				}
				System.out.println("平均分數為:"+ total/student.length);
				break;
			case 4:
				if(!input){
					System.out.println("請先輸入成績成績");
					break;	
				}{
				int height=student[0];
				for(int x=0;x<student.length;x++){
					if(height<student[x]){
						height=student[x];
					}
				}
				System.out.println("最高分為:"+ height);
				}
				break;
			case 5:
				if(!input){
					System.out.println("請先輸入成績成績");
					break;	
				}
				int low=0;
				for(int x=1;x<student.length;x++){
					if(student[low]>student[x]){
						low=x;
					}
				}
				System.out.println("最低分:" + student[low]);
				break;
			case 6:
				if(!input){
					System.out.println("請先輸入成績成績");
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