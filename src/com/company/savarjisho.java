package com.company;

import java.util.Scanner;

public class savarjisho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        int i = 0;
        int n = scan.nextInt();

        while (i != n) {
            i++;
            int j = i;
            while(j>0){
                x = x*i;
                j--;
            }
        }

        scan.close();

        System.out.println(x);
    }
}