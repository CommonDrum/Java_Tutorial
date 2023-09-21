package Day20_09.Shapes;

import static java.lang.Math.*;

public class Circle implements IShape {
    private double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

