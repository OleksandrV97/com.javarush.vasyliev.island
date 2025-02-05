import Settings.Settings;
import entity.AnimalLifeCycle;
import entity.AnimalMover;
import entity.Island;
import generating.Generating;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {

        Island island = new Island(Settings.columsCount, Settings.rowsCount);
        System.out.print("Создан мир размером: columsCount -> " + Settings.columsCount + " rowsCount -> " + Settings.rowsCount);
        System.out.println("#".repeat(77));

        Generating generating = new Generating(island);
        generating.generatingBiot();

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4 );

        executorService.scheduleAtFixedRate(new Generating(island), 0 , 5, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new AnimalMover(island), 0 , 3, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new AnimalLifeCycle(island), 0 , 6, TimeUnit.SECONDS);
    }
}
