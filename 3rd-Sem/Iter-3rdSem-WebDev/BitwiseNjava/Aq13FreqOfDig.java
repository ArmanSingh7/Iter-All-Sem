public class Aq13FreqOfDig {
    public static void main(String[] args) {
        int number=1212;
        int[] frequency = new int[10];

        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of digit " + i + ": " + frequency[i]);
            }
        }
    }
}