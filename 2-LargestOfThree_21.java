import java.util.Scanner;

public class LargestOfThree_21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = reader.nextDouble();
        double num2 = reader.nextDouble();
        double num3 = reader.nextDouble();
        
        double largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is " + largest);
    }
}

