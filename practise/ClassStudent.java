class ClassStudent
{
 Student [] student;
 private int count=0;
 public ClassStudent(int count)
 {
  if(count>0 && count<31)
  {
   this.count=count;	
   student=new Student[count];
   for(int i=0;i<count;i++)
   {
   	student[i]=new Student();
   }	
  }
  else
   return;
 }
 public int getCount()
 {
 	return count;
 }	
 public void setStudent(int index,Student studentObj)
 {
 	student[index]=studentObj;
 }	
 public Student getStudent(int index)
 {
  if(index>0 && index<=count)
  {
  	
  }
  else
  {
   return null;
  }			
 }	
 
}