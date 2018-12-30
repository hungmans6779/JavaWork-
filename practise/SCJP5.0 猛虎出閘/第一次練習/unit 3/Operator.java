interface OrderEnumT
{
 int i=10;
}	

public enum Operator implements OrderEnumT
{
 PLUSONE()
 { 
 	 int operate(int x) { return x; } 
 },
 ABS
 { public int operate(int x) { return x; }
 };
 
 abstract int operate(int x);
 
}