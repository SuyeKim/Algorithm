class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;        // 자릿수 합
        int numKeep = x;    // 나누기 위한 x 값 저장, 안하면 13 계산할 시 for문에서 x가 0이 되고나서 if문을 만나기 때문에 true로 나옴

        while (x != 0) {
            sum += x % 10;    // 12 % 10 = 2
            x /= 10;          // 12 / 10 = 1
        }

        if (numKeep % sum != 0) // 원래의 x값 % 자릿수의 합, 나머지가 0이 아니면 하샤드 수 X
            answer = false;

        return answer;
    }
}
