package hometask2;

public class Jungler extends DotaPlayer implements Drinker {
    public Jungler(String n, int l, int netWorth) {
        super(n, l, netWorth);
    }

    @Override
    public Role getRole() {
        return Role.JUNGLER;
    }

    @Override
    public void play() {
        System.out.println("Drinking bear");
    }

    @Override
    public void lineFarm(boolean levelUp) {
        System.out.println("Yoh, team do you now who is this man?");
        if (levelUp) {
            level += 1;
        }

        netWorth += creepWorth / 2;
    }

    @Override
    public void drinkVodka() {
        die();
        die();
        die();
        //destroyBelongings();
    }

    @Override
    public void farm(int goldAmount, boolean levelUp) {
        super.farm(goldAmount / 2, levelUp);
    }
}
