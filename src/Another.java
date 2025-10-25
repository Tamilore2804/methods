import java.util.Scanner;
public class Another {
    public static int add(int l1, int l2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
             sum+=i;
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("How many times do you wish to carry out the program?");
        int tries = scanner.nextInt();

        while(count < tries){
            System.out.println("Enter the starting number: ");
            int n1 = scanner.nextInt();

            System.out.println("Enter the ending number: ");
            int n2 = scanner.nextInt();

            System.out.println("The sum of numbers from " + n1 + " to " + n2 + " is " + add(n1, n2));
            count++;
        }



    }
}
