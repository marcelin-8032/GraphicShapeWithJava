package questions;

import java.util.Scanner;

public class Question8 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //
        System.out.print("All prime number smaller than this number, insert the number:  ");
        int a = sc.nextInt();
        int count = 0, sum = 0;
        boolean isPrime = true;

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
                sum = sum + i;
                System.out.println(i);
                isPrime = false;
            }
        }
    }
}
