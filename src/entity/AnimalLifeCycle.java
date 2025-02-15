package entity;


import Settings.Settings;
import entity.creature.animal.Animal;

import java.util.Iterator;

public class AnimalLifeCycle implements  Runnable {
    private final Island island;



    public AnimalLifeCycle(Island island) {
    this.island = island;
    }


    @Override
    public void run() {
        for (int x = 0; x < Settings.columsCount; x++){
            for (int y = 0; y < Settings.rowsCount; y++) {
                Location location = island.getLocation(x, y);
                Iterator<Animal> iterator = Location.getAnimalsOnCell().iterator();
                while (iterator.hasNext()){
                    Animal animal = iterator.next();
                    animal.decreaseSaturation();
                    if (animal.getSaturation() <= 0 ) {
                        iterator.remove();
                        System.out.println(animal.getClass().getSimpleName() + " умер от голода [" + x + "," + y + "]");
                    }
                }
            }
        }
    }
}
