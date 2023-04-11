class Solution {
    public int solution(int slice, int n) {
        // 한 사람이 먹는 최소 피자 조각 수는 1이므로
        // n명의 사람이 먹는 최소 피자 조각 수는 n이다.
        // 그러므로 최소한 slice * n개의 피자 조각이 필요하다.
        int minSlices = slice * n;
        
        // 피자를 한 판씩 시키면서
        for (int pizzas = 1; pizzas <= 10000; pizzas++) {
            // 각 판에서 얻을 수 있는 피자 조각 수 계산
            int slicesPerPizza = pizzas * slice;
            
            // 피자 조각 수가 n명의 사람 수보다 크거나 같으면
            if (slicesPerPizza >= n) {
                // 최소 판수를 반환하고 종료
                return pizzas;
            }
        }
        
        // 만약 모든 경우에도 조건을 만족하지 않으면 -1 반환
        return -1;
    }
}
