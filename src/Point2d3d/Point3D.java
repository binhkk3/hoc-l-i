package Point2d3d;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {
    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void coorDinates(){
        System.out.println("tọa độ của bạn là "+ getX()+" : "+getY()+" : "+getZ());
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + getX() +
                ", y=" + getY() +
                "z=" + z +
                '}';
    }
}
