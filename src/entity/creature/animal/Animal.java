package entity.creature.animal;

import Settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import util.Direction;

import java.util.Random;

public abstract class Animal extends Creature {

    protected maxSaturation; // МАКСЫМАЛЬНАЯ СЫТОСТЬ
    protected saturation;    // СЫТОСТЬ satiety = ? вес
    protected weight;        // ВЕС ЖИВОТНОГО
    protected speed;         // СКОРОСТЬ ПЕРЕМЕЩЕНИЯ

    public int getSaturation() {
        return saturation;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    private static final Random random = new Random();

    public void move(Island island, Location currentLocation) {
        Direction direction = Direction.values()[random.nextInt(Direction.values().length)];

        int newX = currentLocation.getX();
        int newY = currentLocation.getY();

        switch (direction) {
            case UP -> newY -= speed;
            case DOWN -> newY += speed;
            case LEFT -> newX -= speed;
            case RIGHT -> newX += speed;
        }

        if (newX < 0 || newX >= Settings.columsCount || newY < 0 || newY >= Settings.rowsCount) {
            return;
        }

        Location newLocation = island.getLocation(newX, newY);

        if (newLocation.addAnimal(this)) {
            currentLocation.removeAnimal(this);
        }
    }


    public Animal reproduced(Location location) {
        long count = location.getAnimalCount(this.getClass());
        if (count >= 2) {
            try {
                return this.getClass().getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void die(){
        this.getClass().getSimpleName();
    }

    public void decreaseSaturation() {
        saturation--;
        if (saturation <= 0) {
            die();
        }
    }

    public void increaseSaturation(int amout) {
        this.saturation = Math.min(this.saturation + amout, this.maxSaturation);
    }
}
