package java_pratice.Absrtract;
abstract  class Shape
{
    abstract  int Rectangle();
    abstract  int Squarearea();
    abstract  double Circlearea();
    int length;
    int breath;
    int radius;
    int side;

}
class Area extends Shape {

    Area(int length,int breath,int side,int radius) {
        this.length = length;
        this.breath = breath;
        this.side = side;
        this.radius = radius;
    }



    @Override
    int Rectangle() {

        return length * breath;


    }

    @Override
    int Squarearea( ) {

        return side * side;


    }

    @Override
    double Circlearea( ) {
        return 3.141 * radius*radius;
    }
}
public class Abstract6 {
    public static void main(String[] args) {
        Area A=new Area(5,6,7,8);
        System.out.println("area of rectangle");
        System.out.println( A.Rectangle());
        System.out.println("area of square");
        System.out.println( A.Squarearea());
        System.out.println("area of circle");
        System.out.println( A.Circlearea());


    }
}
