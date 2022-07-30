package hometask2;

public enum Outpost  {
    OUR, ENEMY;
    int count = 1;

    public Outpost outpostStatement() {
        if (count % 2 == 0)
            return OUR;
        return ENEMY;
    }

    public void getStatement(Outpost outpost) {
        System.out.println(outpost.outpostStatement());
    }

    public void captureOutpost() {
        if (count % 2 != 0) {
            count++;
        }
    }

    public void enemyCaptureOutpost() {
        if (count % 2 == 0) {
            count++;
        }
    }
}
