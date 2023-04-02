class Solution {
    public int solution(int num) {
       //1.
        int answer = 0;
        //2.
        while(num != 1){
            //3.
            answer++;
            //4.
            if(num % 2 == 0) {
                num = num / 2;
            }else if(num % 2 == 1){
                num = num * 3 + 1;
            }
            //5.
           if(answer == 500) {
                answer = -1;
                break;
            }

        }
        
        return answer;
    }
}