class S
{}
class Skill extends S
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
class Cat1 extends Animal
{
 S s;
 public S getKind()
 {
  s=new S();
  return s;
 }
}