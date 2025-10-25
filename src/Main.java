import java.util.Scanner;
public class Main{
    public static int sum(int i, int j){

        return i + j;
    }
 public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum(num1, num2));
            System.out.println();

            count++;
        }

 }
}