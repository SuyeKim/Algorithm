class Solution {
    public int solution(int num, int n) {
        if(num % n == 0){ // num이 n의 배수인지 확인
            return 1;    // 맞으면 1 반환
        }
        else{
            return 0;    // 아니면 0 반환
        }
    }
}