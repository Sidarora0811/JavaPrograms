package src.basics_23Dec;

import java.util.Scanner;

public class Lab065 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        int count=0;

        for(int i=2;i<=num;i++){

            if(num%i==0)
            {
                count++;

            }


            }

        if (count==1){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }






    }
}
