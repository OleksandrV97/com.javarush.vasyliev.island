package entity;

import java.util.Random;

public class AnimalMover implements Runnable {
    private final Island island;
    private static final Random random = new Random();

    public AnimalMover(Island island) {
        this.island = island;
    }


    @Override
    public void run() {

    }
}
