interface A
{
 public void doSomething(String thing);
}

class AImpl implements A
{
 public void doSomething(String msg)
 {}
}

class B
{
 public A doit()
 { }
 public String execute()
 { }
}

public class EXAME124 extends B
{
 public AImpl doit()
 { }
 public Object execute()
 {}
}
