import java.util.Scanner;

public class AreaCalculation {

    void calculateAreaCircle(double radius){
        double areaOfSqr = Math.PI * radius * radius;
        System.out.printf("Area of the circle: %.3f\n", areaOfSqr);
    }

    void calculateAreaRectangle(double length, double breadth){
        double areaOfRec = length * breadth;
        System.out.printf("Area of the rectangle: %.3f\n", areaOfRec);



    }

}

    class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculation calc = new AreaCalculation();

        System.out.println("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.println("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.println("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();



        calc.calculateAreaCircle(radius);
        calc.calculateAreaRectangle(length,breadth);
        sc.close();
    }
}
