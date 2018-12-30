enum Animal
{
 DOG("woof"),CAT("meow"),FISH("burble");
 String sound;
 Animal(String s)
 {
  sound=s;
 }
}

public class P1
{
 static Animal an;
 public static void main(String argv[])
 {
  System.out.println(an.DOG.sound+" "+an.FISH.sound);
 }
}