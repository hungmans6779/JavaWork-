interface I
{
 void setX(int x);
 int getX();
 interface A extends I
 {
  void m();
 }
}

//interface B implements I{}
abstract class C implements I
{
 public void setX(int x)
 { 
 }		
}

class D implements I
{
 public void setX(int x)
 {}
 public int getX()
 {
  return 1;	
 }	
}	

/** 此部份錯誤的！！！
class E implements I
{
 public int getX()
 {
 	return 1;
 }		
}	
*/