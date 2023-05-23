package efs.task.oop;

public class Main {
    public static void clash(Villager villager, Monster monster) {
        System.out.println("Potwory posiadaja jeszcze " + Monsters.getMonstersHealth() + " punkty zycia");
        System.out.println("Aktualnie walczacy osadnik to " + villager.getName());
        villager.attack(monster);
        monster.attack(villager);
    }

    public static void main(String[] args) {

        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();

        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;

        while (Monsters.getMonstersHealth() > 0) {
            if (Monsters.getAndariel().getHealth() > 0)
                clash(kashya, Monsters.getAndariel());
            if (Monsters.getAndariel().getHealth() > 0)
                clash(gheed, Monsters.getAndariel());
            if (Monsters.getAndariel().getHealth() > 0)
                clash(warriv, Monsters.getAndariel());
            if (Monsters.getAndariel().getHealth() > 0)
                clash(flawia, Monsters.getAndariel());

            if (Monsters.getBlacksmith().getHealth() > 0)
                clash(kashya, Monsters.getBlacksmith());
            if (Monsters.getBlacksmith().getHealth() > 0)
                clash(gheed, Monsters.getBlacksmith());
            if (Monsters.getBlacksmith().getHealth() > 0)
                clash(warriv, Monsters.getBlacksmith());
            if (Monsters.getBlacksmith().getHealth() > 0)
                clash(flawia, Monsters.getBlacksmith());

        }
        System.out.println("Obozowisko ocalone!");
        akara = (ExtraordinaryVillager) objectAkara;
        deckardCain = (ExtraordinaryVillager) objectDeckardCain;


    }
}
