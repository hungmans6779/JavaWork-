enum Animal
{
 DOG(4),CAT(4),PEOPLE(2);
 int legs;
 private Animal(int legs)
 {
  this.legs=legs;
 }
 public  void show()
 {
  switch(this)
  {
   case DOG: System.out.println("狗有: "+legs+" 支腳");
   case CAT: System.out.println("貓有: "+legs+" 支腳");
   case PEOPLE:System.out.println("人類有: "+legs+" 支腳");
   default: System.out.println("不在此範圍內");
  }
 }
 public static void main(String argv[])
 {
 	new Animal().show();
 }	
}
