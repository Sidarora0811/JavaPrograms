package src.basics_23Dec;

import java.util.Scanner;

public class Lab064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int Num = sc.nextInt();
        System.out.println("Enter Power");
        int Power = sc.nextInt();
        int total=1;

        for (int i = 1; i <=Power ; i++) {

            total *=Num;

        }

        System.out.println(total);






    }
}
