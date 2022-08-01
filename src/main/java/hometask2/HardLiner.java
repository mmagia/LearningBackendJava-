package hometask2;

public class HardLiner extends DotaPlayer {
    public HardLiner(String n, int l, int netWorth) {
        super(n, l, netWorth);
    }

    @Override
    public Role getRole() {
        return Role.HARDLINER;
    }

    @Override
    public void play() {
        System.out.println("Soaking up the damage");
    }

    @Override
    public void lineFarm(boolean levelUp) {
        if (levelUp) {
            level += 1;
        }

        netWorth += creepWorth;
    }

    @Override
    public void farm(int goldAmount, boolean levelUp) {
        super.farm(goldAmount, levelUp);
    }
}
