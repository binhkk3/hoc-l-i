package TangTILeHinh;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangular rectangular = new Rectangular();
        rectangular = new Rectangular();
        circle = new Circle();
        System.out.println(circle.perimeter(6));
        System.out.println(rectangular.perimeter(4,7));
    }
}
