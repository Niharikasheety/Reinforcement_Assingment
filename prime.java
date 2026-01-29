class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;   // number to check
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is Not a Prime Number");
    }
}
