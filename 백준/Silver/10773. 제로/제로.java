import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for(int i=0;i<K;i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                stack.pop();
            }else{
                stack.push(n);
            }


        }
        int sum = 0;
        for(int o : stack){
            sum += o;
        }
        System.out.println(sum);

    }
}
