/*
Question : Write a program to print armstrong number in given range.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start,end,temp,sum = 0,temp2;
        System.out.println("Enter the starting range of number :");
        start = sc.nextInt();
        System.out.println("Enter the ending range of number :");
        end = sc.nextInt();
        System.out.println("Printing the result :");
        for (int i = start; i <= end; i++){
            temp = i;
            while (temp > 0){
                temp2 = temp % 10;
                sum = sum + (temp2 * temp2 * temp2);
                temp  = temp / 10;
            }
            if (sum == i){
                System.out.println(sum);
            }
            sum = 0;
        }
    }
}

