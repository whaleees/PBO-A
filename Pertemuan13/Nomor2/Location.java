public class Location {
    private int row;
    private int col; 

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setLocation(Location l){
        this.row = l.row;
        this.col = l.col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Location) {
            Location other = (Location) obj;
            return row == other.getRow() && col == other.getCol();
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }
}
