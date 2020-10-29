package thread.rabbit;

import javax.swing.*;

public class Rabbit implements Runnable {

    private static final int MILESTONES = 5;
    private final Thread rabbit;
    private float timeUsedByRabbit = 0f;

    public Rabbit() {
        this.rabbit = new Thread(this, "Rabbit");
    }

    public Thread getRabbit() {
        return rabbit;
    }

    public float getTimeUsedByRabbit() {
        return timeUsedByRabbit;
    }

    public void setTimeUsedByRabbit(float timeUsedByRabbit) {
        this.timeUsedByRabbit = timeUsedByRabbit;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Rabbit has started from the start line!");
                    timeUsedByRabbit = (float) (timeUsedByRabbit + 1.5);
                    break;
                case 1:
                    System.out.println("The Rabbit has reached the Cool River!");
                    timeUsedByRabbit = (float) (timeUsedByRabbit + 1.5);
                    break;
                case 2:
                    System.out.println("The Rabbit has reached the Mountain Hill!");
                    timeUsedByRabbit = (float) (timeUsedByRabbit + 1.5);
                    break;
                case 3:
                    System.out.println("The Rabbit has reached the Big Oak Tree!");
                    System.out.println("The Rabbit is leading and hence is going to sleep!");
                    timeUsedByRabbit = (float) (timeUsedByRabbit + 1.5);
                    try {
                        Thread.sleep(9000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Rabbit's sleep got interrupted!");
                    }
                    timeUsedByRabbit = (float) (timeUsedByRabbit + 9.0);
                    break;
                case 4:
                    System.out.println("The Rabbit has reached the finish line!");
                    timeUsedByRabbit = (float) (timeUsedByRabbit + 1.5);
                    break;
            }
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Rabbit has completed the race!",
                "Rabbit",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
