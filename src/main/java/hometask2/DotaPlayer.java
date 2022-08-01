package hometask2;

public abstract class DotaPlayer implements Farmeable, Mortal, GameRuiner, CaptureOutpost, OutpostStatementObserver,
        EnemyCaptureOutpost, Killer {

    public static int teamKills = 0;
    private static final Integer defaultLevel = 1;
    private static final Integer defaultNetworth = 600;

    protected final Integer creepWorth = 55;
    protected Outpost outpost = Outpost.ENEMY;
    protected String nickName;
    protected Integer level;
    protected Integer netWorth;


    public DotaPlayer(String n, int l, int netWorth) {
        this.nickName = n;
        if (netWorth > 0 && l > 0) {
            this.level = l;
            this.netWorth = netWorth;
        } else {
            this.level = defaultLevel;
            this.netWorth = defaultNetworth;
        }
    }

    @Override
    public String toString() {
        return nickName + " is " + getRole() + ", he has " + level + " level with netWorth " + netWorth;
    }

    public abstract void play();

    @Override
    public void farm(int goldAmount, boolean levelUp) {
        if (levelUp) {
            level++;
        }
        netWorth += goldAmount;
    }

    @Override
    public void die() {
        netWorth = netWorth - netWorth / 10;
    }

    @Override
    public void buyBack() {
        netWorth = netWorth - netWorth / 13;
    }

    @Override
    public void captureOutpost() {
        outpost.captureOutpost();
    }

    @Override
    public void destroyItems() {
        netWorth = 0;
    }

    @Override
    public void enemyCaptureOutpost() {
        outpost.enemyCaptureOutpost();
    }

    @Override
    public void printOutpostStatement() {
        System.out.println(outpost.outpostStatement());
    }

    @Override
    public void kill() {
        teamKills += 1;
    }

    @Override
    public int getTeamKills() {
        return teamKills;
    }

    public abstract Role getRole();

    public enum Role {

        CORE, FULL_SUPPORT, HARDLINER, JUNGLER, MIDER, SEMI_SUPPORT
    }

}
