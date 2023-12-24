package src.basics_23Dec;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab062 {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int Input = user_input.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(Input+ " x "+i+"= "+Input*i);
        }
    }
}
