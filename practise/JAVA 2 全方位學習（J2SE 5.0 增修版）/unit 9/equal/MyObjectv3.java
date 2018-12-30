public class MyObjectv3
{
 private int data;
 public MyObjectv3(int i)
 {
  data=i;
 }
 public boolean equals(Object obj)
 {
  if(obj!=null && (obj instanceof MyObjectv3))
   if (this.data==((MyObjectv3)obj).data)
     return true;
    
    return false;    
 }
}