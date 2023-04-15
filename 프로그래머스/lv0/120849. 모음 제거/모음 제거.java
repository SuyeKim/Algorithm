public class Solution {
    public String solution(String my_string) {
        String vowels = "aeiou"; // 모음 문자열
        String answer = ""; // 결과 문자열 초기화

        // 문자열에서 한 문자씩 검사
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            // 모음인 경우 결과 문자열에 추가하지 않음
            if (vowels.indexOf(ch) >= 0) {
                continue;
            }
            // 모음이 아닌 경우 결과 문자열에 추가
            answer += ch;
        }

        return answer;
    }
}