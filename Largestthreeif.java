import java.util.Scanner;

public class Largestthreeif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number1, number2, number3. ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        int largest;
        
        if (number1 >= number2) {
            if (number1 >= number3) {
                largest = number1;
            } else {
                largest = number3;
            }
        } else {
            if (number2 >= number3) {
                largest = number2;
            } else {
                largest = number3;
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
    
