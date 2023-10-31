import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start value: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end value: ");
        int end = scanner.nextInt();
        if (start >= end){
            System.out.println("Error! start number is bigger than end number!");
        }else{
            int sum = 0;

            for (int i = start; i <= end; i++) {
                sum += i;
            }

            System.out.println("The sum from " + start + " to " + end + " is: " + sum);
        }

        
    }
}
