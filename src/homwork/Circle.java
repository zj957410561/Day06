package homwork;

public class Circle {
    Point point;
    double radius;

    public Circle() {
        super();
    }

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void printCircle(){
        point.printPoint();
        System.out.println(radius);
    }
}
