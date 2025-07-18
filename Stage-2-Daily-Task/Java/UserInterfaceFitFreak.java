import java.util.*;
public class UserInterfaceFitFreak {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            FitFreakManagementSystem system = new FitFreakManagementSystem();

            System.out.println("Enter the age");
            int age = Integer.parseInt(sc.nextLine());

            List<FitFreak> freaks = system.retrieveFitFreakListBasedOnAge(age);

            if (freaks.isEmpty()) {
                System.out.println("No FitFreak records available for the given age");
            } else {
                for (FitFreak f : freaks) {
                    System.out.println("fitnessId=" + f.getFitnessId()
                            + ", name=" + f.getName()
                            + ", gender=" + f.getGender()
                            + ", age=" + f.getAge()
                            + ", height=" + f.getHeight()
                            + ", weight=" + f.getWeight());
                }
            }
        }
    }


