class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int num2 = box[0] / n;
        int num3 = box[1] / n;
        int num1 = box[2] / n;
        return num3*num2*num1*answer;
    }
}