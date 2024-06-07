
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) throws Exception {
        

        Calc myCalc = new Calc();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to calculate its Factorial");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = myCalc.calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    
    }

    
}

