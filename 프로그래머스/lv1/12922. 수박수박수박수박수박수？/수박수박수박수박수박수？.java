class Solution {
    public String solution(int n) {
       String answer = "";
        
    String[] str = {"수","박"};
        for(int i = 0; i <n; i++){
      answer += i % 2 == 0 ? str[0] : str[1];
        }
        return answer;
    }
}
