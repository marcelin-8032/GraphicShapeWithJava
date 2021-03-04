package questions;

import java.util.Scanner;

public class Question6 {


    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.print("First Number: ");
        int a = scn.nextInt();
        System.out.print("Second Number: ");
        int b = scn.nextInt();
        int sum = 0, mul = 1;
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                sum = sum + i; //
                mul = mul * i;
            }
            System.out.println("Sum: " + sum + " Mul: " + mul);
        } else {
            System.out.println("!!!!The first number shoud be smaller than second number!!!!");
        }

    }


}
