package efs.task.oop;

public class ExtraordinaryVillager extends Villager {


    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String enumSkill;

        Skill(String enumSkill) {
            this.enumSkill = enumSkill;
        }

        public String getEnumSkill() {
            return enumSkill;
        }
    }

    private Skill skill;


    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;

    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + getName() + " and I'm " + getAge() + " years old. " + skill.getEnumSkill());
    }

    @Override
    public void takeHit(int damage) {
        this.health = 0;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);
    }
}
