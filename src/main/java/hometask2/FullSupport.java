package hometask2;

public class FullSupport extends DotaPlayer implements WardPlacer {

    private int placedWards = 0;

    public FullSupport(String n, int l, int netWorth) {
        super(n, l, netWorth);
    }

    @Override
    public Role getRole() {
        return Role.FULL_SUPPORT;
    }

    @Override
    public void play() {
        System.out.println("Helping my carry");
    }

    @Override
    public void lineFarm(boolean levelUp) {
        if (levelUp) {
            level += 1;
        }
        System.out.println("Why did you take the creep?");
        netWorth += creepWorth;
    }


    @Override
    public int getPlacedWards() {
        return placedWards;
    }

    @Override
    public void placeWard() {
        System.out.println("And another one");
        placedWards++;
    }

    @Override
    public void farm(int goldAmount, boolean levelUp) {
        super.farm(0, levelUp);
        System.out.println("You mustn't farm, give your extra gold to your core");
    }
}
