public class Solution {
    public int solution(int hp) {
        int generals = hp / 5; // 장군개미의 수
        hp %= 5;
        int soldiers = hp / 3; // 병정개미의 수
        hp %= 3;
        int ants = generals + soldiers + hp; // 일개미의 수
        return ants;
    }
}