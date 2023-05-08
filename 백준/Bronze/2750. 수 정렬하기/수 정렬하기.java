import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        int tmp;
        for(int i=0; i<arr.length-1; i++){
            for(int j = 0 ; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i<N; i++){
            System.out.println(arr[i]);

        }
    }
}