package Day20_09;

public class Point {

    /*
    Utwórz klasę o nazwie Point z polami x i y typu double.
    Odpowiadającymi współrzędnym na płaszczyźnie kartezjańskiej.
    Zdefiniuj też klasę Rect opisującą prostokąty na płaszczyźnie kartezjańskiej
     z bokami równoległymi do osi; polami tej struktury są dwa punkty będące lewym górnym
     i prawym-dolnym wierzchołkiem prostokąta.oraz metody:
    • countField - Liczącą pole prostokąta
    • countDiagonal - Liczącą przekątną prostokąta
     */

    private double x;
    private double y;

    Point(double inX, double inY){
        x = inX;
        y = inY;

    }

    public double getX(){
        return  x;
    }

    public double getY(){
        return  y;
    }



}
