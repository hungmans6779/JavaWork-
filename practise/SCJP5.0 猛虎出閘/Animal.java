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
   case DOG: return "����: "+legs+" ��}";
   case CAT: return "�ߦ�: "+legs+" ��}";
   case LION: return "��l��: "+legs+" ��}";
   default : return "�S���F";
  }	
 }
 public static void main(String argv[])
  {
  	System.out.println(Animal.DOG.getLegs());
  	System.out.println(Animal.CAT.getLegs());
  	System.out.println(Animal.LION.getLegs());
  }
}