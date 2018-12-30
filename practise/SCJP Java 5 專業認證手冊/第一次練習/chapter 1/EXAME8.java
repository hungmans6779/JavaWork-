enum Animal
{
 DOG("woof"),CAT("meow"),FISH("burble");
 String sound;
 Animal(String s)
 {
  sound=s;
 }
}

public class EXAME8
{
 static Animal a;
 public static void main(String argv[])
 {
  System.out.println(a.DOG.sound+"  "+a.FISH.sound);
 }
}