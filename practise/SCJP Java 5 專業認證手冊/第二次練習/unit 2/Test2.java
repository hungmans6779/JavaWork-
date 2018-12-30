interface Chewable {}
class Gum implements Chewable{}
public class Test2
{
 public static void main(String argv[])
 {
 
 }
 public static Chewable getGum()
 {
 	return new Gum();
 }	
}