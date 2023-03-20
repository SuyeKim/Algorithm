class Solution {
    public int solution(int n, int k) {
        int meat = 12000 * n;
        int drink = 2000 * k;
        int answer = meat + drink - ( (n / 10) * 2000);
        return answer;
    }
}

