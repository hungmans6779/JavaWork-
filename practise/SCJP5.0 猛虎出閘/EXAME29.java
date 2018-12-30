interface A
{
 public int getValue();
}

class B implements A
{
 public int getValue()
 {
  return 1;
 }
}

class EXAME29 extends B
{
 public void add(EXAME29 exame)
 { exame.getValue(); }
 
 
 public void add(B b)
 { b.getValue(); }
 
 public void add(A a)
 { a.getValue(); }
 
 public void add(A a,B b)
 {
  a.getValue();	
 }	

}