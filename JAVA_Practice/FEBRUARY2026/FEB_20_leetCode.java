class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countPrimeSet = 0;

        for (int i = left; i <= right; i++) {

            int countBit = 0;
            int temp = i;

            while (temp > 0) {
                temp = temp & (temp - 1);
                countBit++;
            }

            if (isPrime(countBit)) {
                countPrimeSet++;
            }
        }

        return countPrimeSet;
    }

    private boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}