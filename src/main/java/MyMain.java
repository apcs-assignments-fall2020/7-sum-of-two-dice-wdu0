import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        double d = Math.random()*6+1;
        int value = (int) d;
        return value;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] array = new int[11];
        for (int i = 0; i < n; i++) {
            int a = rollDie();
            int b = rollDie();
            int total = a + b;
            array[(total-2)] ++;
        }
        return array;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pair of dice would you like to roll?");
        int num = scan.nextInt();

        int[] arr = sumOfTwoDice(num);
        double total = num;

        for (int i = 0; i < arr.length; i++) {
            double number = arr[i];
            double percent = (number / total) * 100.0;
            System.out.println("% of rolls where sum == "+ (i+2) +": " + percent);
        }
        scan.close();
    }
}
