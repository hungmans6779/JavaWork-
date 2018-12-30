class Skill
{ }
class AdvSkill extends Skill
{}

class  Animal 
{
 Skill skill;
 public Skill getSkill()
 {
  skill=new Skill();
  return skill;
 }
}

public class Dog extends Animal
{
 Skill advSkill;
 public Skill getSkill()
 {
  advSkill=new AdvSkill();
  return advSkill;
 }
 public static void main(String argv[])
 {
 }		
}