package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter ten scores:");
            for(int i = 0; i < 10; i++) {
                sum += key.nextInt();
        }
        System.out.println(sum / 10);
    }
}
