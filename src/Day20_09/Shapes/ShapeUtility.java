package Day20_09.Shapes;

import java.util.List;
import java.util.ArrayList;
public class ShapeUtility {

    public static void main(String[] args){

        List<IShape> shapes = new ArrayList<>();
        shapes.add(new Square(5));
        shapes.add(new Square(10));
        shapes.add(new Rectangle(5, 8));
        shapes.add(new Rectangle(3, 12));
        shapes.add(new Circle(4));
        shapes.add(new Circle(6));

        System.out.println("Largest area (for): " + findLargestAreaUsingFor(shapes));
        System.out.println("Largest area (for-each): " + findLargestAreaUsingForEach(shapes));
        System.out.println("Largest perimeter (for): " + findLargestPerimeterUsingFor(shapes));
        System.out.println("Largest perimeter (for-each): " + findLargestPerimeterUsingForEach(shapes));

    }
    public static double findLargestAreaUsingFor(List<IShape> shapes) {
        double maxArea = 0;
        for (int i = 0; i < shapes.size(); i++) {
            double currentArea = shapes.get(i).calculateArea();
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
        }
        return maxArea;
    }

    public static double findLargestAreaUsingForEach(List<IShape> shapes) {
        double maxArea = 0;
        for (IShape shape : shapes) {
            double currentArea = shape.calculateArea();
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
        }
        return maxArea;
    }

    public static double findLargestPerimeterUsingFor(List<IShape> shapes) {
        double maxPerimeter = 0;
        for (int i = 0; i < shapes.size(); i++) {
            double currentPerimeter = shapes.get(i).calculatePerimeter();
            if (currentPerimeter > maxPerimeter) {
                maxPerimeter = currentPerimeter;
            }
        }
        return maxPerimeter;
    }

    public static double findLargestPerimeterUsingForEach(List<IShape> shapes) {
        double maxPerimeter = 0;
        for (IShape shape : shapes) {
            double currentPerimeter = shape.calculatePerimeter();
            if (currentPerimeter > maxPerimeter) {
                maxPerimeter = currentPerimeter;
            }
        }
        return maxPerimeter;
    }
}
