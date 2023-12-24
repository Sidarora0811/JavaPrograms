package src.basics_23Dec;

import java.util.Scanner;

public class Lab063 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number for which you want to get the factorial");
        int fact = sc.nextInt();



        for (int i = fact-1; i >= 1 ; i--) {

            fact = fact *i;

        }
        System.out.println(fact);
    }
}
