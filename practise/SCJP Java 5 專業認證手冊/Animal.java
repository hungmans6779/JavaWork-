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
   case DOG: System.out.println("����: "+legs+" ��}");
   case CAT: System.out.println("�ߦ�: "+legs+" ��}");
   case PEOPLE:System.out.println("�H����: "+legs+" ��}");
   default: System.out.println("���b���d��");
  }
 }
 public static void main(String argv[])
 {
 	new Animal().show();
 }	
}
