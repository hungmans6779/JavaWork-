class Test1
{
 public Test1 foo()
 {
  return this;
 }
}

class Test2 extends Test1
{
 public Test1 foo()
 {
  return this;
 }
}

public class EXAME47 extends Test2
{
 public Test1 foo()
 { return this; }
 /*
 public Test1 foo()
 { return this; }
 */ 
}