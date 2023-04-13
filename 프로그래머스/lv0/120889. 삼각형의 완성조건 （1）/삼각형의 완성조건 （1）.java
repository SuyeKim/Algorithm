import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides); // 세 변을 오름차순으로 정렬
        if (sides[2] >= sides[0] + sides[1]) { // 가장 긴 변의 길이가 다른 두 변의 길이의 합보다 큰 경우
            return 2; // 삼각형을 만들 수 없음
        } else {
            return 1; // 삼각형을 만들 수 있음
        }
    }
}