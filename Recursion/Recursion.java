public class Recursion {
    public static void main(String[] args) {
//        recursion();
//        myFuncRecursion1(5);    // Output: 5 4 3 2 1
//        myFuncRecursion2(5);    // Output: 1 2 3 4 5
//        myFuncRecursion3(3);    // Output: 1 2 1 3 1 2 1
        myFuncRecursion4(3);    // Output: 3 2 1 1 2 3
    }

   static int num = 5;
    public static void recursion(){
        if (num>0) {
            num--;
            recursion();
            System.out.println("100");
        }
    }

    public static void myFuncRecursion1(int num){
        if (num == 0) return;   // sirf return iss liye likha hai kyu ki method type void hai.
        System.out.println(num);
        myFuncRecursion1(num-1);
    }
    public static void myFuncRecursion2(int num){
        if (num == 0) return;   // sirf return iss liye likha hai kyu ki method type void hai.
        myFuncRecursion2(num-1);
        System.out.println(num);
    }
    public static void myFuncRecursion3(int num){
        if (num == 0) return;
        myFuncRecursion3(num-1);
        System.out.println(num);
        myFuncRecursion3(num-1);
    }
    public static void myFuncRecursion4(int num){
        if (num == 0) return;
        System.out.println(num);
        myFuncRecursion4(num-1);
        System.out.println(num);
    }
}
