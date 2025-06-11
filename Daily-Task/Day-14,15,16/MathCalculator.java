public class MathCalculator {
    int add(int a, int b){
        return a + b;
    }
    double add(double a,double b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

    static class Addition{
        public static void main(String[] args) {
            MathCalculator c = new MathCalculator();
            System.out.println("add two numbers: "+ c.add(3,2));
            System.out.println("add double type numbers: "+ c.add(3.9,5.4));
            System.out.println("add three numbers: "+ c.add(3,4,6));
        }
    }
}
