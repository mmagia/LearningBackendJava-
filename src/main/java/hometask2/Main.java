package hometask2;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void nextLine() {
        System.out.println("\n");
    }

    public static int teamKills(DotaPlayer[] arr) {
        int result = 0;
        for (DotaPlayer dotaPlayer : arr) {
            result += dotaPlayer.getTeamKills();
        }
        return result;
    }

    public static void main(String[] args) {

        DotaPlayer alex = new Carry("Belle", 1, 600);
        DotaPlayer marat = new FullSupport("Boar aye blyadun", 1, 600);
        DotaPlayer denis = new HardLiner("mmagia.", 1, 600);
        DotaPlayer ilusha = new Mider("Andraq", 1, 600);
        DotaPlayer ashatich = new SemiSupport("Nalchik", 1, 600);
        DotaPlayer artem = new Jungler("av1gu", 1, 600);
        DotaPlayer ourDefaultAlly = new DotaPlayer("default_login", 1, 0) {
            @Override
            public void play() {
                System.out.println("i cant play");
            }

            @Override
            public Role getRole() {
                return Role.FULL_SUPPORT;
            }

            @Override
            public void lineFarm(boolean levelUp) {
                System.out.println("i dont know how to farm");
            }
        };

        DotaPlayer[] team = new DotaPlayer[]{alex, denis, ashatich, marat, ilusha, artem, ourDefaultAlly};

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (DotaPlayer player : team) {
            player.farm(1000);
            System.out.println(player);
            player.play();
            player.kill();
            if (player instanceof FullSupport) {
                FullSupport support = (FullSupport) player;
                support.placeWard();
                support.placeWard();
                support.placeWard();
                support.placeWard();
                System.out.println(support.getPlacedWards());
            }

            if (random.nextInt(0, 5) == 1) {
                player.destroyItems();
            }
            nextLine();
            System.out.println("* * * * *");
            nextLine();
        }

    }
}
