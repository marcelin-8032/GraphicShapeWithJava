package questions;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();

        int count = 0, large = 0;
        boolean isPrime=true;

        for (int i = 1; i < a; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i != 2) {
                count++;
                large = i;
                System.out.println(i);
                isPrime = false;
            }
        }
        System.out.print(count + "  " + large);

    }

}
