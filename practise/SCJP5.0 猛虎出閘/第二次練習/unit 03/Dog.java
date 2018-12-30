class Skill {}

class AdvSkill extends Skill{}

class Animal
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
 AdvSkill advskill;
 public AdvSkill getSkill()
 {
  advskill=new AdvSkill();
  return advskill;
 }
}