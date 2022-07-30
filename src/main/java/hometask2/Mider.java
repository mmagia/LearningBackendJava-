package hometask2;

import java.util.Scanner;

public class Mider extends DotaPlayer implements Ganker{
    public Mider(String n, int l, int netWorth) {
        super(n, l, netWorth);
    }

    @Override
    public Role getRole() {
        return Role.MIDER;
    }

    @Override
    public void play() {
        System.out.println("Sweating in zxc 1vs1 lobby");
    }

    @Override
    public void lineFarm(boolean levelUp) {
        if (levelUp) {
            level += 2;
        }
        netWorth += creepWorth;
    }

    @Override
    public void farm(int goldAmount, boolean levelUp) {
        if (levelUp) {
            this.level += 2;
        }
        this.netWorth += goldAmount;
    }

    @Override
    public void gank() {
        Scanner in = new Scanner(System.in);
        System.out.println("Where do you need help team? (Type 1 to go top, type 2 to go bottom)");
        String cmdMessage = in.nextLine();
        if (cmdMessage.compareTo("1") == 0) {
            System.out.println("Going top, start fight there");
        }

        if (cmdMessage.compareTo("2") == 0) {
            System.out.println("Going bottom, start fight there");
        }

    }

}
