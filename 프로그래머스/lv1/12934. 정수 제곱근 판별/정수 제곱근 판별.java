class Solution {
  public static long solution(long n) {
        Double sqrt =Math.sqrt(n); //<제곱근 구하는 식

        if(sqrt == sqrt.intValue()){ //정수형 숫자로 바꿈
            return (long)Math.pow(sqrt+1,2);
        }else{
            return -1;
        }
    }
}