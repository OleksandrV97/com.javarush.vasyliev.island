package entity;

import Settings.Settings;

public class Island{
    private final Location[][] locations;

    public Island() {
        locations = new Location[Settings.columsCount][Settings.rowsCount];
        for (int x =0; x < Settings.columsCount; x++) {
            for (int y = 0; y < Settings.rowsCount; y++) {
                locations[x][y] = new Location(x, y);
            }
        }
    }

    public int getWidth(){
        return locations.length;
    }

    public int getHeight() {
        return locations[0].length;
    }

    public Location getLocation(int x, int y) {
        return locations[x][y];
    }

}

