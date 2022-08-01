package hometask2;

public class Carry extends DotaPlayer {
    public Carry(String n, int l, int netWorth) {
        super(n, l, netWorth);
    }

    @Override
    public Role getRole() {
        return Role.CORE;
    }

    @Override
    public void play() {
        System.out.println("Farming and dealing damage");
    }

    @Override
    public void die() {
        netWorth = netWorth - netWorth / 9;
    }

    @Override
    public void lineFarm(boolean levelUp) {
        if (levelUp) {
            level += 1;
        }
        netWorth += creepWorth * 2;
    }

    @Override
    public void farm(int goldAmount, boolean levelUp) {
        super.farm(goldAmount * 2, levelUp);
    }
}
