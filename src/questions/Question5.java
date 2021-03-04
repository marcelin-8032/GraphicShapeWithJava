package questions;

import java.util.Scanner;

public class Question5 {


    public static void main(String[] args) {
        Scanner scnn = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scnn.nextInt();
        int result = 1;
        int q = a / 10;

        //-----------avec do-while---------- //
        do {
            q = q / 10;
            result++;
        } while (q != 0);
        System.out.println(result);

        //------------ avec while--------- //

        while (q != 0) {
            q = q / 10;
            result++;
        }
        System.out.println(result);
    }
}
