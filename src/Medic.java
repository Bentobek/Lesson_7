public class Medic extends Hero {
    private double healPoints;

    public Medic(int health, int damage, String superAbilityType, double healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }
    public double getHealPoints() {
        return healPoints;
    }

    public void increaseExperience() {
        healPoints *= 1.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + getApplySuperAbility());
        System.out.println("Текущие очки лечения: " + healPoints);
    }
}
