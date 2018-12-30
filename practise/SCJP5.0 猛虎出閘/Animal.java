enum Animal
{
 DOG(2),CAT(2),LION(4);
 public int legs;
 private Animal(int legs)
 {
  this.legs=legs;
 }
 public String getLegs()
 {
  switch(this)
  {
   case DOG: return "狗有: "+legs+" 支腳";
   case CAT: return "貓有: "+legs+" 支腳";
   case LION: return "獅子有: "+legs+" 支腳";
   default : return "沒有了";
  }	
 }
 public static void main(String argv[])
  {
  	System.out.println(Animal.DOG.getLegs());
  	System.out.println(Animal.CAT.getLegs());
  	System.out.println(Animal.LION.getLegs());
  }
}