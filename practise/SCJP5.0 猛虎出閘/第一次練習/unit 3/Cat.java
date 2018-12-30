class Skill
{}
class AdvSkill extends Skill
{}
class Animal
{
 Skill skill;
 public Skill getKind()
 {
  skill=new Skill();
  return skill;
 }
}
class Cat extends Animal
{
 AdvSkill advSkill;
 public AdvSkill getKind()
 {
  advSkill=new AdvSkill();
  return advSkill;
 }
}