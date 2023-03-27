
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num = common[1] - common[0];

        if (common[2] == common[1] + num) {
            answer = common[common.length - 1] + num;
        } else {
            num = common[1] / common[0];
            answer = common[common.length - 1] * num;
        }


        return answer;
    }
}