class Solution {
public int solution(int angle) {
    if (angle > 0 && angle < 90) { // 예각
        return 1;
    } else if (angle == 90) { // 직각
        return 2;
    } else if (angle > 90 && angle < 180) { // 둔각
        return 3;
    } else if (angle == 180) { // 평각
        return 4;
    } else { // 그 외의 경우
        return -1; // 예외 처리 (잘못된 입력)
    }
}
}