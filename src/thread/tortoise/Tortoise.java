package thread.tortoise;

public class Tortoise extends Thread{

    private static final int MILESTONES = 5;

    private final Thread tortoise;
    private float timeTakenByTortoiseToCompleteTheRace = 0f;

    public Tortoise(Thread tortoise) {
        this.tortoise = tortoise;
    }
}
