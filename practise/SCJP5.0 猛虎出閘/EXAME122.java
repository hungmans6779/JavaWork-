class Plant
{
 public Plant()
 {
 	this("ttt");
 }		
 String name;
 public Plant(String name)
 { this.name=name; }
 public String getName() {return name; }
}

public class EXAME122 extends Plant
{
 public void growFruit(){}
 public void dropLeaves() {}
 public static void main(String argv[])
 {
 	EXAME122 exame122=new EXAME122();
 }	
}