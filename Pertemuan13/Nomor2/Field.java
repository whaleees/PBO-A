    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.Random;

    public class Field {
        private int width;
        private int height;
        private Object[][] grid; 

        public Field(int height, int width) {
            this.width = width;
            this.height = height;
            this.grid = new Object[height][width]; 
        }

        public void clear() {
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    grid[row][col] = null;
                }
            }
        }    

        public void clear(Location location) {
            grid[location.getRow()][location.getCol()] = null;
        }

        public void place(Object obj, Location location) {
            grid[location.getRow()][location.getCol()] = obj;
        }

        public Object getObjectAt(Location location) {
            return grid[location.getRow()][location.getCol()];
        }

        public Location freeAdjacentLocation(Location location) {
            List<Location> adjacent = getAdjacentLocations(location);
            for (Location loc : adjacent) {
                if (getObjectAt(loc) == null) {
                    return loc;
                }
            }
            return null;
        }

        public List<Location> getFreeAdjacentLocations(Location location) {
            List<Location> free = new ArrayList<>();
            List<Location> adjacent = getAdjacentLocations(location);
            for (Location loc : adjacent) {
                if (getObjectAt(loc) == null) {
                    free.add(loc);
                }
            }
            return free;
        }

        public List<Location> getAdjacentLocations(Location location) {
            List<Location> locations = new ArrayList<>();
            int x = location.getRow();
            int y = location.getCol();

            if (x > 0) {
                locations.add(new Location(x - 1, y)); // Atas
            }
            if (x < height - 1) {
                locations.add(new Location(x + 1, y)); // Bawah
            }
            if (y > 0) {
                locations.add(new Location(x, y - 1)); // Kiri
            }
            if (y < width - 1) {
                locations.add(new Location(x, y + 1)); // Kanan
            }

            Collections.shuffle(locations, new Random());
            return locations;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }
