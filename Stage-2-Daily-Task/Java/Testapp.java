import java.util.Scanner;

    class TestApp {

    public static String checkShape(Shape shape) {
        return switch (shape) {
            case Triangle t -> (t.getNoOfSides() == 3) ? "This is a triangle" : "Just a normal shape";
            case Circle c -> (c.getNoOfSides() == 0) ? "This is a circle" : "Just a normal shape";
            default -> "Just a normal shape";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int sides = sc.nextInt();

        Shape shape = switch (sides) {
            case 3 -> new Triangle(sides);
            case 0 -> new Circle(sides);
            default -> new Shape(sides);
        };

        String result = checkShape(shape);
        System.out.println(result);
    }
}
