package entity.creature.animal;

import entity.Location;
import entity.creature.Creature;

public class Animal extends Creature {
    // ОБЩИЕ ХАРАКТЕРИСТИКИ
    // СЫТОСТЬ satiety = ? вес
    // ВЕС ЖИВОТНОГО
    // СКОРОСТЬ ПЕРЕМЕЩЕНИЯ
    void eat(Creature c) {

        // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
        // КТО ИМЕННО ЭТОТ Creature БУДЕТ ВЛИЯТЬ НА ФОРМАТ ПОЕДАНИЯ
        // КОГДА СТАНЕТ ПОНЯТНО КТО КОНКРЕТНО ЭТО Creature
        // МЫ МОЖЕМ ОПРЕДЕЛИТЬ ВЕРОЯТНОСТЬ ЕГО ПОЕДАНИЯ И РЕАЛИЗОВАТЬ ЭТУ ЛОГИКУ
    }

    void move() {
        // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
    }

    Creature reproduce(Location location) {
        // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
        return null;
    }

    void die() {
        // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
    }

    void decreaseWeight(){
    }
}
