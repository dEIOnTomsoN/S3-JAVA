import java.util.Scanner;

public class FrequencyOfLetter_21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = reader.nextLine();
        System.out.print("Enter a letter to find its frequency: ");
        char letter = reader.next().charAt(0);
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                frequency++;
            }
        }
        System.out.println("The frequency of " + letter +  " is " + frequency);
    }
}

