public abstract class Hero implements HavingSuperAbility {
    private int healPoints;
    private int damage;
    private String applySuperAbility;

    public Hero(int healPoints, int damage, String applySuperAbility) {
        this.healPoints = healPoints;
        this.damage = damage;
        this.applySuperAbility = applySuperAbility;
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getApplySuperAbility() {
        return applySuperAbility;
    }

    public void setApplySuperAbility(String applySuperAbility) {
        this.applySuperAbility = applySuperAbility;
    }
}
