class Solution {
    public int[] solution(int[] num_list) {

    int evenCount = 0; // 짝수 개수를 담을 변수
    int oddCount = 0; // 홀수 개수를 담을 변수
    
    for (int num : num_list) {
        if (num % 2 == 0) { // 짝수인 경우
            evenCount++;
        } else { // 홀수인 경우
            oddCount++;
        }
    }
    
    int[] answer = {evenCount, oddCount}; // 결과 배열 생성
    return answer;
}
}