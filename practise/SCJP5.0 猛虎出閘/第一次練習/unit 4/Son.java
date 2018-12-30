class Father 
{
 void aMethod() throws Exception
 { }
 void bMethod() throws Exception
 { }
 void cMethod() throws ArithmeticException
 { }
}
public class Son extends Father
{
 void aMethod() throws java.io.IOException
 { }
 void bMethod() throws Exception,ArithmeticException
 { }
 void cMethod() // throws Exception
 { }

}