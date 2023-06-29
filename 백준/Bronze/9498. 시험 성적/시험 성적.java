

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str , "");
        int A = Integer.parseInt(st.nextToken());
        String grade;

        switch(A/10){
            case 9: case 10:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            default:
                grade="F";
                break;
        }
        System.out.println(grade);
    }
}
