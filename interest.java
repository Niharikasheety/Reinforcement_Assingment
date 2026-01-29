class SimpleInterest {
    public static void main(String[] args) {
        int principal = 1000;   // P
        int rate = 5;           // R (in %)
        int time = 2;           // T (in years)

        int simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}
