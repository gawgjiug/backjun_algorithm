import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(factorial(N));


    }

    public static long factorial(int n) {
        if(n == 0 || n == 1){
        return 1;
        }
        else {
            return n*factorial(n-1);
        }

    }
}
