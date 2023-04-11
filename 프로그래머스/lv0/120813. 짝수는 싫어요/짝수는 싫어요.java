import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2]; // n 이하의 홀수는 (n + 1) / 2 개가 있음

        for (int i = 0; i < answer.length; i++) {
            answer[i] = i * 2 + 1; // 홀수를 차례로 배열에 저장
        }

        return answer;
    }
}