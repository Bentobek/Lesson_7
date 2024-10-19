public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Warrior(100, 50, "CRITICAL DAMAGE");
        heroes[1] = new Magic(80, 40, "FIREBALL");
        heroes[2] = new Medic(120, 30, "HEALING" , 50);
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Увеличено опыт лечения Medic: " + medic.getHealPoints());
            }
        }
    }
}
