package TangTILeHinh;

public class Rectangular extends Shape {
    private int longs = 1;
    private int width = 1;

    public Rectangular() {
    }

    public Rectangular(int color) {
        super(color);
    }

    public Rectangular(int color, int longs, int width) {
        super(color);
        this.longs = longs;
        this.width = width;
    }

    public Rectangular(int longs, int width) {
        this.longs = longs;
        this.width = width;
    }

    public int getLongs() {
        return longs;
    }

    public void setLongs(int longs) {
        this.longs = longs;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int area (int width, int longs){
        return 2*(width+longs);
    }
    public int perimeter (int width,int longs){
        return width*longs;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "longs=" + longs +
                ", width=" + width +
                '}';
    }
}
