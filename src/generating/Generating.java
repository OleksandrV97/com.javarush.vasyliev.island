package generating;

import Settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;

import java.util.Random;

public class Generating implements Runnable {
    private final Island island;

    public static final Random random = new Random();

    public Generating(Island island) {
        this.island = island;
    }


   public void Generating(){
       for (int i = 0; i < random.nextInt(Settings.bearMaxNumber) + 1; i++) {
           getRandomLocation().addAnimal(new Bear());
       }
       for (int i = 0; i < random.nextInt(Settings.eagleMaxNumber); i++) {
           getRandomLocation().addAnimal(new Eagle());
       }
       for (int i = 0; i < random.nextInt(Settings.foxMaxNumber); i++) {
           getRandomLocation().addAnimal(new Fox());
       }
       for (int i = 0; i < random.nextInt(Settings.snakeMaxNumber); i++) {
           getRandomLocation().addAnimal(new Snake());
       }
       for (int i = 0; i < random.nextInt(Settings.wolfMaxNumber); i++) {
           getRandomLocation().addAnimal(new Wolf());
       }
       for (int i = 0; i < random.nextInt(Settings.caterpillarMaxNumber); i++) {
           getRandomLocation().addAnimal(new Caterpillar());
       }
       for (int i = 0; i < random.nextInt(Settings.cowMaxNumber); i++) {
           getRandomLocation().addAnimal(new Cow());
       }
       for (int i = 0; i < random.nextInt(Settings.deerMaxNumber); i++) {
           getRandomLocation().addAnimal(new Deer());
       }
       for (int i = 0; i < random.nextInt(Settings.duckMaxNumber); i++) {
           getRandomLocation().addAnimal(new Duck());
       }
       for (int i = 0; i < random.nextInt(Settings.goatMaxNumber); i++) {
           getRandomLocation().addAnimal(new Goat());
       }
       for (int i = 0; i < random.nextInt(Settings.hamsterMaxNumber); i++) {
           getRandomLocation().addAnimal(new Hamster());
       }
       for (int i = 0; i < random.nextInt(Settings.horseMaxNumber); i++) {
           getRandomLocation().addAnimal(new Horse());
       }
       for (int i = 0; i < random.nextInt(Settings.kangarooMaxNumber); i++) {
           getRandomLocation().addAnimal(new Kangaroo());
       }
       for (int i = 0; i < random.nextInt(Settings.rabbitMaxNumber); i++) {
           getRandomLocation().addAnimal(new Rabbit());
       }
       for (int i = 0; i < random.nextInt(Settings.sheepMaxNumber); i++) {
           getRandomLocation().addAnimal(new Sheep());
       }

    }

    private Location getRandomLocation() {
        int x = random.nextInt(Settings.columsCount);
        int y = random.nextInt(Settings.rowsCount);
        return island.getLocation(x,y);
    }


    @Override
    public void run() {
        System.out.println("#".repeat(77));
    }
}
