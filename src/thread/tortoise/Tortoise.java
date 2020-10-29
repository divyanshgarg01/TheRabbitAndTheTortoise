package thread.tortoise;

public class Tortoise extends Thread{

    private static final int MILESTONES = 5;

    private final Thread tortoise;
    private float timeUsedByTortoise = 0f;

    public Tortoise(Thread tortoise) {
        this.tortoise = tortoise;
    }

    public Thread getTortoise() {
        return tortoise;
    }

    public float getTimeUsedByTortoise() {
        return timeUsedByTortoise;
    }

    public void setTimeUsedByTortoise(float timeUsedByTortoise) {
        this.timeUsedByTortoise = timeUsedByTortoise;
    }
}
