public class CountOccurences {
    public static void main(String[] args) {
        int n = 123456;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 7) {
                count++;
                }
                n = n / 10;
                }
                System.out.println("The digit 7 occurs " + count + " times");
                
    }
}
