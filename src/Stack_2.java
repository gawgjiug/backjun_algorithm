import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;



public class Stack_2 {

    static LinkedList<Integer> stack = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        //첫번 째 줄에 받을 명령의 수(N)을 입력받고 N개만큼 아래의 명령을 수행한다


        //정수 X 를 스택에 넣는다

        // 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력

        //스택에 들어있는 정수의 개수를 출력한다.

        //스택이 비어있으면 1, 아니면 0 을 출력한다

        //스택에 정수가 있다면 맨 위의 정수를 출력한다 없다면 -1을 대신 출력한다


        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        while (N --> 0){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("1")){
                stack.addFirst(Integer.parseInt(st.nextToken()));
            } else if (command.equals("2")) {
                sb.append(stack.isEmpty() ? - 1 : stack.pollFirst()).append("\n");
            } else if (command.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("5")) {
                sb.append(stack.isEmpty()? -1 : stack.getFirst()).append("\n");
            }
        }

        br.close();

        System.out.println(sb);

    }
}
