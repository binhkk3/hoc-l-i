package TangTILeHinh;

public class Shape {
    private int color;

    public Shape(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                '}';
    }
}
