package entity;

import Settings.Settings;
import entity.creature.animal.Animal;
import entity.creature.animal.predator.Predator;
import entity.creature.plant.Plant;

import java.util.List;
import java.util.Random;

public class AnimalEater  {
    private final Random random = new Random();

    public  void eating(Location location) {
        List<Animal> animals = location.getAnimals();
        List<Plant> plants = location.getPlants();

        for (Animal animal : animals) {
            if (animal instanceof Predator) {
                eatOtherAnimals(animal, location);
            } else {
                eatPlants(animal,plants);
            }
        }
    }

    private void eatOtherAnimals(Animal predator, Location location) {
        List<Animal> potentialPrey = location.getAnimals();
        for (Animal prey : potentialPrey) {
            if (predator.getClass() != prey.getClass()) {
                int chance = Settings.getEatingChace(predator.getClass(), prey.getClass());
                if (random.nextInt(100) < chance) {
                    predator.increaseSaturation(prey.getWeight());
                    break;
                }
            }
        }
    }

    private void eatPlants(Animal herbivor, List<Plant> plants) {
        if (plants.isEmpty()){
            herbivor.increaseSaturation(5);
            plants.remove(0);
        }
    }
}
