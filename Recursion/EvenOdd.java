import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd: ");
        int num = sc.nextInt();
//       if (isEven(num) == true){
//           System.out.println(num+ " is Even");
//       }
//       else {
//           System.out.println(num+" is odd");
//       }

       /* ============================================ */
        if (isEven(num)){
            System.out.println(num+ " is even.");
        }
        else{
            System.out.println(num+" is odd.");
        }
    }
//    public static boolean isEven(int num){
//        if (num == 0){
//            return true;
//        }
//        else{
//            return isOdd(num-1);
//        }
//    }
//    public static boolean isOdd(int num){
//        if (num == 0){
//            return false;
//        }
//        else {
//            return isEven(num-1);
//        }
//    }

    /* =============================================================== */
    public static boolean isEven(int num){
        if(num == 0){
            return true;
        } else if (num == 1) {
            return false;
        }
        else{
            return isEven(num-2);
        }
    }
}
