package com.teachmeskills.lesson7.HW.Homework0;

import java.util.Scanner;

public class RunnerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the job code (1 - Director, 2 - Accountant, 3 - Worker): ");
        int positionCode = scanner.nextInt();
        Workable position;
        switch (positionCode) {
            case 1:
                position = new Director();
                break;
            case 2:
                position = new Accountant();
                break;
            case 3:
                position = new Worker();
                break;
            default:
                System.out.println("Invalid entry");
                return;
        }
        position.workablePosition();
    }
}
