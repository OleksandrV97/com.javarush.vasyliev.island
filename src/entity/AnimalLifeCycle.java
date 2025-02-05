package entity;


import entity.creature.animal.Animal;

public class AnimalLifeCycle implements  Runnable {
    private final Island island;



    public AnimalLifeCycle(Island island) {
    this.island = island;
    }


    @Override
    public void run() {

    }
}
