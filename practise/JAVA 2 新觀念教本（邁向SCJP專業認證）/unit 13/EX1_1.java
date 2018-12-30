public class EX1_1
{
 public static void main(String argv[])
 {
  MyLinkedInt<Integer> m=new MyLinkedInt<Integer>();
  m.add(25);
  m.add(77);
  m.add(43);
  m.add(12);
  m.add(36);
  m.add(81);
  m.showData();
  m.insert(3,99);
  m.showData();
 }
}

class MyLinkedInt<T>
{
 MyNode<T> first;
 MyNode<T> last;
 int length;
 class MyNode<T>
 {
 	int data;
 	MyNode next;
 	MyNode(int data)
 	{
 	 this.data=data;	
 	}	
 
 	
 }	
 
 	public void add(int data)
 	{
 	 if(length==0	)
 	 {
 	 	first=new MyNode(data);
 	 	last=first;
 	 	length=1;
 	 }	
 	 else
 	 {
 	 	last.next=new MyNode(data);
 	 	last=last.next;
 	 	length++;
 	 }	
 	}	
 	public int insert(int index,int data)
 	{
 	 if(index>=length)
 	 {
 	 	return -1;
 	 }		
 	 if(index==0)
 	 {
 	 	MyNode temp=first;
 	 	first=new MyNode(data);
 	 	first.next=temp;
 	 }	
 	 else
 	 {
 	 	MyNode insertLoc=first;
 	 	for(int i=0;i<index-1;i++)
 	 	 insertLoc=insertLoc.next;
 	 	 
 	 	MyNode tmp=insertLoc.next;
 	 	insertLoc.next=new MyNode(data);
 	 	insertLoc.next.next=tmp;
 	 }	
 	 return ++length;
 	}	 
 public void showData()
 {
 	MyNode pointer=first;
 	for(int i=0;i<length;i++)
 	{
 	 System.out.print(pointer.data+" ");
 	 if(pointer.next!=null)
   {
 	 pointer=pointer.next;	
 	 }
  }
 	System.out.println();		
 }	
}