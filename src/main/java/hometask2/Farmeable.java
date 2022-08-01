package hometask2;

public interface Farmeable {
    void lineFarm(boolean levelUp);

    void farm(int goldAmount, boolean levelUp);

    default void farm(int goldAmount) {
        farm(goldAmount, false);
    }
}
