package src.basics_23Dec;

import java.util.Scanner;

public class Lab066 {

    public static void main(String[] args) {

        System.out.println("Enter the Year");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Year is leap year");

        }
        else{
            System.out.println("Year is not a leap year");}
    }
}

