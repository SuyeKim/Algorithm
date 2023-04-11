import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 주어진 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        // 배열의 맨 끝 두 수를 곱한 값이 최댓값이 될 수 있음
        int maxProduct = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return maxProduct;
    }
}