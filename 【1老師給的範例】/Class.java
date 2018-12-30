import java.util.*;
public class Class{
	private Student[] student;
	private int count;
	public int getCount(){
		return count;
	}
	public Student getStudent(int index){
		return student[index];
	}
	public Student getStudent(String number){
		String[] temp=new String[count];
		int[] indexArray=new int[count];
		for(int a=0;a<student.length;a++){
			temp[a]=student[a].getNumber();
			indexArray[a]=a;
		}
		sortArray(temp,indexArray);
		int index=Arrays.binarySearch(temp,number);
		if(index>0)
			return student[indexArray[index]];
		return null;
	}
	//提供學號及姓名之排序功能
	private void sortArray(String[] stringArray,int[] indexArray){

		for(int b=0;b<stringArray.length-2;b++){
			for(int a=b+1;a<stringArray.length-1;a++){
				if(stringArray[b].compareTo(stringArray[a])>0){
					String s=stringArray[b];
					stringArray[b]=stringArray[a];
					stringArray[a]=s;
					int i=indexArray[b];
					indexArray[b]=indexArray[a];
					indexArray[a]=i;
				}
			}
		}
	}
	//提供分數之排序功能
	private void sortArray(int[] score,int[] indexArray){
		for(int b=0;b<score.length-2;b++){
			for(int a=b+1;a<score.length-1;a++){
				if(score[b]>score[a]){
					int s=score[b];
					score[b]=score[a];
					score[a]=s;
					int i=indexArray[b];
					indexArray[b]=indexArray[a];
					indexArray[a]=i;
				}
			}
		}
	}
	public void setStudentData(int index,Student studentObject){
		student[index]=studentObject;
	}
	public void setStudentData(int index,String number,String name,Date birthday,int sex,int[] score){
		student[index].setNumber(number);
		student[index].setName(name);
		student[index].setBirthday(birthday);
		student[index].setSex(sex);
		student[index].setScore(score);
	}
	public Class(int count){
		if(count>0 && count<31){
			this.count=count;
			student=new Student[count];
			for(int a=0;a<student.length;a++){
				student[a]=new Student();
			}
		}else{
			student=null;
		}
	}
}