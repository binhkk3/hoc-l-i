package tamgiac;

public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean check(double a,double b,double c){
        if(a>=(b+c)||b>=(c+a)||c>=(a+b)){
            System.out.println("đây không phải là tam giác :");
            return true;
        }
        return false;
    }
    public double Perimeter(double a,double b,double c){
        if(check(a, b, c)==true){
            double perimeter = a+b+c;
            //System.out.println("Perimeter là: "+perimeter);
            return perimeter;
        }
        return -1;
    }
    public double area (double a,double b,double c){
        double area;
        if (check(a, b, c)==true){

            area = 0.25*Math.sqrt(( Perimeter(a, b, c)*(a+b-c)*(b+c-a)*(c+a-b)));
            //System.out.println("area là: " + area);
            return area;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}

