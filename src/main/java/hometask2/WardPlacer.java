package hometask2;

public interface WardPlacer {

    default int getPlacedWards() {
        return 0;
    }

    void placeWard();
}
