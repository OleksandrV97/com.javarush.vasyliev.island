import entity.Island;

public class Application {
    public static void main(String[] args) {

        Island island = new Island(Settings.columsCount, Settings.rowsCount);
        System.out.print("Создан мир размером: ");
        int x = Settings.rowsCount;
        int y = Settings.columsCount;
        System.out.println("rowsCount ->" + y + "columsCount ->" + x);
        System.out.println("#".repeat(77));


    }
}
