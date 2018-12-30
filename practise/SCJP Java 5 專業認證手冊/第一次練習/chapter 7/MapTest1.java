import java.util.*;
class Dog
{
 String name;
 Dog(String name)
 {
  this.name=name;
 }
}

class Cat{}

enum Pets{DOG,CAT,HORSE}

public class MapTest1
{
 public static void main(String argv[])
 {
  Map<Object,Object> m=new HashMap<Object,Object>();
  m.put("k1",new Dog("aiko")); 
  m.put("k2",Pets.DOG);
  m.put(Pets.CAT,"CAT key");
  Dog d1=new Dog("clover");
  m.put(d1,"Dog key");
  m.put(new Cat(),"Cat key");
  System.out.println(((Dog)m.get("k1")).name);
  String k2="k2";
  System.out.println(m.get(k2));
  Pets p=Pets.CAT;
  System.out.println(m.get(p));

  System.out.println(m.get(d1));
  System.out.println(m.get(new Cat()));
  System.out.println("size = "+m.size());
  
  
 }
}