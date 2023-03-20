class Solution {
    public int solution(double n) {
        int answer = 0;
        Double pizza = n/7;
        for(int i=0; i<pizza; i++){
              answer++; 
        }
        return answer;
    }
}