class Solution {
   public static boolean solution(String s) {
        boolean answer = true;
        String input = "";
        //1. s의 길이가 4 혹은 6
        //.숫자로만 구성 되어있는지 확인
        //3. 비교
        if (s.length() == 4 || s.length() == 6) {
            try {
               int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException y) {
                return false;
            }
        }
        else{
            return false;
        }
    }
        public static void main (String[]args){
            String s = "3e43";
            System.out.println(solution(s));
        }

}