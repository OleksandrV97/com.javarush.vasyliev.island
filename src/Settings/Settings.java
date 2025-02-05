package Settings;

import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivor.*;
import entity.creature.animal.predator.*;

import java.util.HashMap;
import java.util.Map;

public class Settings {

    public  final static  int columsCount = 100;
    public  final static  int rowsCount = 1000;

    public final static int bearWeight = 500;
    public final static int bearMaxNumber = 5;
    public final static int bearSpeed = 2;
    public final static int bearSaturation = 80;

    public final static int eagleWeight = 6;
    public final static int eagleMaxNumber = 20;
    public final static int eagleSpeed = 3;
    public final static int eagleSaturation = 1;

    public final static int foxWeight = 8;
    public final static int foxMaxNumber = 3;
    public final static int foxSpeed = 2;
    public final static int foxSaturation = 2;

    public final static int snakeWeight = 15;
    public final static int snakeMaxNumber = 30;
    public final static int snakeSpeed = 1;
    public final static int snakeSaturation = 3;

    public final static int wolfWeight = 50;
    public final static int wolfMaxNumber = 30;
    public final static int wolfSpeed = 50;
    public final static int wolfSaturation = 50;
    //
    //
    public final static double caterpillarWeight = 0.01;
    public final static int caterpillarMaxNumber = 1000;
    public final static int caterpillarSpeed = 0;
    public final static int caterpillarSaturstion = 0;

    public final static int cowWeight = ;
    public final static int cowMaxNumber = ;
    public final static int cowSpeed = ;
    public final static int cowSaturation = ;

    public final static int deerWeight = 300;
    public final static int deerMaxNumber = 20;
    public final static int deerSpeed = 4;
    public final static int deerSaturation = 50;

    public final static int duckWeight = 1;
    public final static int duckMaxNumber = 200;
    public final static int duckSpeed = 4;
    public final static double duckSaturation = 0.15;

    public final static int goatWeight = 60;
    public final static int goatMaxNumber = 140 ;
    public final static int goatSpeed = 3;
    public final static int goatSaturation = 10;

    public final static int hamsterWeight = ;
    public final static int hamsterMaxNumber = ;
    public final static int hamsterSpeed = ;
    public final static int hamsterSaturation = ;

    public final static int horseWeight = 400;
    public final static int horseMaxNumber = 20;
    public final static int horseSpeed = 4;
    public final static int horseSaturation = 60;

    public final static int kangarooWeight = ;
    public final static int kangarooMaxNumber = ;
    public final static int kangarooSpeed = ;
    public final static int kangarooSaturation = ;

    public final static int rabbitWeight = 2;
    public final static int rabbitMaxNumber = 150;
    public final static int rabbitSpeed = 2;
    public final static double rabbitSaturation = 0.45;

    public final static int sheepWeight = 70;
    public final static int sheepMaxNumber = 140;
    public final static int sheepSpeed = 3;
    public final static int sheepSaturation = 10;

    public final static int buffaloWeight = 400;
    public final static int buffaloMaxSpeed = 50;
    public final static int buffaloSpeed = 2;
    public final static int buffaloSaturation = 50;

    public final static double mauseWeight = 0.05;
    public final static int mouseMaxNumber = 500;
    public final static int mouseSpeed = 1;
    public final static double mouseSaturation = 0.01;

    // Растения
    public final static double plantWeight = 1;
    public final  static int plantMaxNumber = 200;

    // Вероятность попадания
    public static final Map<Class<? extends Animal> , Map<Class<? extends Creature>, Integer>> eatingProbabilities = new HashMap<>();

    static {
        Map<Class<? extends Creature>, Integer> wolfDiet = new HashMap<>();
        wolfDiet.put(Mouse.class, 80);
        wolfDiet.put(Sheep.class, 70);
        wolfDiet.put(Rabbit.class,60);
        wolfDiet.put(Goat.class, 60);
        wolfDiet.put(Duck.class, 40);
        wolfDiet.put(Deer.class, 15);
        wolfDiet.put(Boar.class, 15);
        wolfDiet.put(Horse.class, 10);
        wolfDiet.put(Buffalo.class, 10);

        Map<Class <? extends Creature>, Integer> foxDiet = new HashMap<>();
        foxDiet.put(Mouse.class, 90);
        foxDiet.put(Rabbit.class, 70);
        foxDiet.put(Duck.class, 60);
        foxDiet.put(Caterpillar.class, 40);

        Map<Class <? extends Creature>, Integer>  snakeDiet = new HashMap<>();
        snakeDiet.put(Mouse.class, 40);
        snakeDiet.put(Rabbit.class, 20);
        snakeDiet.put(Fox.class, 15);
        snakeDiet.put(Duck.class, 10);

        Map<Class <? extends Creature>, Integer>  bearDiet = new HashMap<>();
        bearDiet.put(Mouse.class, 90);
        bearDiet.put(Snake.class, 80);
        bearDiet.put(Deer.class, 80);
        bearDiet.put(Rabbit.class, 80);
        bearDiet.put(Goat.class, 70);
        bearDiet.put(Sheep.class, 70);
        bearDiet.put(Boar.class, 50);
        bearDiet.put(Horse.class, 40);
        bearDiet.put(Buffalo.class, 20);
        bearDiet.put(Duck.class, 10);


        Map<Class <? extends Creature>, Integer>  eagleDiet = new HashMap<>();
        eagleDiet.put(Rabbit.class, 90);
        eagleDiet.put(Muose.class, 90);
        eagleDiet.put(Duck.class, 80);
        eagleDiet.put(Fox.class, 10);

    // Добавляем хищников в таблицу
        eatingProbabilities.put(Bear.class, bearDiet);
        eatingProbabilities.put(Eagle.class, eagleDiet);
        eatingProbabilities.put(Fox.class, foxDiet);
        eatingProbabilities.put(Snake.class, snakeDiet);
        eatingProbabilities.put(Wolf.class, wolfDiet);
    }

    // Метод получения вероятности выпадения
    public static int getEatingChace(Class<? extends Animal> predator, Class<? extends Creature> prey) {
        return eatingProbabilities.getOrDefault(predator, new HashMap<>()).getOrDefault(prey, 0);
    }
}
