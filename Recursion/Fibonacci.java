import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of find the Fibonacci Series: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci number is: "+fibo(num));
    }

    public static int fibo(int num){
        if (num == 0){
            return 0;
        }
        if (num == 1 || num == 2){
            return 1;
        }
        else {
            return fibo(num-1) + fibo(num-2);
        }
    }
}
