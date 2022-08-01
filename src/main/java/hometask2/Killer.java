package hometask2;

public interface Killer {

    default int getTeamKills() {
        return 0;
    }

    void kill();
}
