import java.util.Scanner;

public class Coin_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr [] = new int[N];

        int K = sc.nextInt();

        for (int i =0; i<N; i++){
                arr[i] = sc.nextInt();
        }

        int count = 0;

        //오름차순이기 때문에 가장 마지막 인덱스 부터 시작.

        for(int i = N-1; i>=0; i--){
            if (arr[i] <= K){

                count += (K/arr[i]);

                K = K % arr[i];
            }


        }

        System.out.println(count);




    }
}
