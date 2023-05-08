import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String str = s.readLine();
        char arr[] = str.toCharArray();
        char tmp;
        for(int i=0; i<arr.length; i++){
            for(int j = 0 ; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);

        }
    }
}