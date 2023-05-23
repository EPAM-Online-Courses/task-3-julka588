package efs.task.oop;

public class Villager implements Fighter {
    private String name;
    private int age;

    protected int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getHealth(){
        return health;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int)((100 - this.age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        this.health -= damage;
    }
}
