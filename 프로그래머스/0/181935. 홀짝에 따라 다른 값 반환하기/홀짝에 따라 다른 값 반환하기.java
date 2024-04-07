class Solution {
    
    public static long solution(int n) {
        if (n % 2 == 1) {
            // n= 홀수
            long sum = 0;
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            return sum;
        } else {
            // n =짝수
            long sumOfSquares = 0;
            for (int i = 2; i <= n; i += 2) {
                sumOfSquares += (long) i * i;
            }
            return sumOfSquares;
        }
    }

    public static void main(String[] args) {
        int oddNumber = 5;
        int evenNumber = 6;
        System.out.println(solution(oddNumber)); // 홀수
        System.out.println(solution(evenNumber)); // 짝수
    }
}
