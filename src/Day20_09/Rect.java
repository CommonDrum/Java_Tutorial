package Day20_09;

import java.lang.Math;

public class Rect {
    private Point leftUpper;
    private Point rightLower;

    private double[] getSidesLength(){
        double lengthSide1 = leftUpper.getY() - rightLower.getY();
        double lengthSide2 = rightLower.getX() - leftUpper.getX();
        return new double[]{lengthSide1,lengthSide2};
    }

    public void countField(){
        double[] sides = getSidesLength();
        System.out.println(sides[0]*sides[1]);
    }

    public void countDiagonal(){
        double[] sides = getSidesLength();
        double diagonal = Math.sqrt(Math.pow(sides[0],2) + Math.pow(sides[1],2));

        System.out.println(diagonal);
    }
}
