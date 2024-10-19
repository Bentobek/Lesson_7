public class Magic extends Hero {
    public Magic(int healPoints, int damage, String applySuperAbility) {
        super(healPoints, damage, applySuperAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + getApplySuperAbility() );
    }
}
