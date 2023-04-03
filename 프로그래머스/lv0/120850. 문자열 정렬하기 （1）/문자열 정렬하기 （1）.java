import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        String[] num1 = my_string.split("");
        int[] answer = new int[num1.length];
        for(int i=0;i<num1.length;i++){
            answer[i] += Integer.parseInt(num1[i]);
            
        }
        Arrays.sort(answer);
        return answer;
    }
}