public class EXAME2_1
{
 int num=1;
 String name;
 String mobile;
 String email;
 public static void main(String argv[])
 {
  EXAME2_1 friend[]=new EXAME2_1[20];
  for(int i=0;i<20;i++)
  {
   friend[i]=new EXAME2_1();	
   friend[i].addFriend(friend[i],i);
  } 
  for(EXAME2_1 f:friend)
  {
   System.out.print(f.num+"\t"+f.name+"\t"+f.mobile+"\t"+f.email+"\n");	
  }	
  
 }
 public void addFriend(EXAME2_1 friend,int n)
 {
  friend.num=n+1;
  friend.name="name"+String.valueOf(n+1);
  friend.mobile="mobile"+String.valueOf(n+1);
  friend.email="email"+String.valueOf(n+1);
 }	
}