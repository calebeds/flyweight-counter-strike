package players;

public class CounterTerrorist implements Player {
    // intrinsic attribute
    private final String TASK;

    //extrinsic attribute
    private String weapon;

    public CounterTerrorist() {
        this.TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + this.weapon + "and task is "  + this.TASK);
    }
}
