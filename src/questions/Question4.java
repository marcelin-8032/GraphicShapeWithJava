package questions;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scn.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }


    }


}
