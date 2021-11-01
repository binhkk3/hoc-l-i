package kethuapont;

public class MoveablePoint extends point{
    private float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public MoveablePoint() {

    }

    public MoveablePoint(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public MoveablePoint(float z) {
        this.z = z;
    }

    public void coorDinates(){
        System.out.println("tọa độ mơi là " +getX()+ " "+getY()+" "+getZ());
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "z=" + z +
                '}';
    }
}
