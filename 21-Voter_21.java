import java.util.Scanner;
public class Voter_21 {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = reader.nextInt();
            if (age >= 18) {
                System.out.println("Eligible to vote.");
            } else {
                MyException me = new MyException();
                throw me;
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}

class MyException extends RuntimeException {
    public String toString() {
        return "VOTER IS NOT ELIGIBLE TO VOTE.";
    }
}

