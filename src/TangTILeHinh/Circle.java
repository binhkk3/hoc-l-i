package TangTILeHinh;

public class Circle extends Shape {
    private int radius=1;

    public Circle(int color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area (int radius){
        return 3.14*2*radius;
    }
    public double perimeter (int radius){
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
