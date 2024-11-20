//import java.util.Scanner;
//
//public class Factorial {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the num: ");
//        int num = sc.nextInt();
//        System.out.print("Factorial is: "+fact(num));
//    }
//
//    public static int fact(int num){
//            if (num <= 1)   // Base condition
//                return num;
//            return num * fact(num-1);   // logic
//    }
//}
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial is: "+fact(num));
    }

    public static int fact(int num){
        if (num<=1) return 1;
        return num * fact(num-1);
    }
}
