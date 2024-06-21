package BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NM_4 {

    private static int N,M;
    private static int [] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        NM(0,1);
        System.out.println(sb);

    }

    private static void NM(int cnt,int start) {



        if(cnt == M)    {
            for(int val : arr){
                sb.append(val).append(" ");

            }
            sb.append("\n");

            return;
        }

        for(int  i = start; i<=N; i++){

            arr[cnt] = i;
            NM(cnt + 1,i);


        }


    }
}

/**/
