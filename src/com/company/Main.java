package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner scanner = new Scanner(System.in);
        int broj = Integer.parseInt(scanner.nextLine());
        System.out.println("Vas broj je: " + broj);
        //    System.out.println(broj%2==0);
        if (broj % 2 == 0) {
            System.out.println("Broj Je Paran.");
        } else  {
            System.out.println("Broj je neparan.");
        }
    }
}
