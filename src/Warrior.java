public class Warrior extends Hero {
    public Warrior(int healPoints, int damage, String applySuperAbility) {
        super(healPoints, damage, applySuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + getApplySuperAbility());
    }
}
