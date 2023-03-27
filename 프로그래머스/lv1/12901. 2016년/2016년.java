class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int date = 0;
        for(int i = 0; i < a - 1; i++) {
            date += month[i];   // 달 더하기
        }
        date += b - 1;  // 일 더하기 (1월 1일부터 시작해서 -1)
        
        answer = day[(date + 5) % 7];   // 1월 1일이 금요일이라서 +5
        
        return answer;
    }
}