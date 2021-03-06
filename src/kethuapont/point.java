package kethuapont;

public class point {
    private float x = 0.0f;
    private float y = 0.0f;

    public point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
