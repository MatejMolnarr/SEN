package funkcie;
import java.util.Scanner;
public class Ulaha {
public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
System.out.print("Zadaj svoju výšku : ");
        double height = scanner.nextDouble();


System.out.print("Zada svoju váhu: ");
double weight = scanner.nextDouble();

     
double bmi = calculateBMI(height, weight);

   
System.out.println(" BMI je: " + bmi);

      
scanner.close();
    }

 
public static double calculateBMI(double height, double weight) {
       
return (1.0 / 3.0) * height * weight;
    }
}
