package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i=0;i<testCase;i++){
            int seats = scan.nextInt();
            int students = scan.nextInt();

            if (seats >= students){
                System.out.println(0);
            }else {
                System.out.println(students - seats);
            }
        }
    }
}
