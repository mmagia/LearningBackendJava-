package hometask2;

public class SemiSupport extends DotaPlayer implements WardPlacer {
    public SemiSupport(String n, int l, int netWorth) {
        super(n, l, netWorth);
    }

    @Override
    public Role getRole() {
        return Role.SEMI_SUPPORT;
    }

    @Override
    public void play() {
        System.out.println("Trying to pick Ember Spirit");
    }

    @Override
    public void lineFarm(boolean levelUp) {
        if (levelUp) {
            this.level += 1;
        }
        netWorth += creepWorth / 3;
    }

    @Override
    public void placeWard() {
        System.out.println("I am not a pos 5, why are you bulling me?");
    }

    @Override
    public void farm(int goldAmount, boolean levelUp) {
        super.farm(goldAmount / 3, levelUp);
    }
}